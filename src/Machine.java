import java.util.List;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
import dendron.Errors;

/**
 * An abstraction of a computing machine that reads instructions
 * and executes them. It has an instruction set, a symbol table
 * for variables (instead of general-purpose memory), and a
 * value stack on which calculations are performed.
 *
 * (Everything is static to avoid the need to master the subtleties
 * of nested class instantiation or to pass the symbol table and
 * stack into every instruction when it executes.)
 *
 *
 * @author James Heliotis
 * @author Nicholas Pembroke
 */
public class Machine {


    ////////////////////////////////////////////////////////
    ////////////     Private Methods/Fileds     ////////////
    ////////////////////////////////////////////////////////


    /** Do not instatiate this class. */
    private Machine() {}

    private static Map< String, Integer > table = null;
    private static Stack< Integer > stack = null;

    /**
     * Reset the Machine to a pristine state.
     * @see Machine#execute
     */
    private static void reset() {
        stack = new Stack<>();
        table = new HashMap<>();
    }


    ///////////////////////////////////////////////////
    ////////////     Public Interfaces     ////////////
    ///////////////////////////////////////////////////


    /**
     * The instructions interface
     */
    public static interface Instruction {

        /**
         * Run this instruction on the Machine, using the Machine's value stack and symbol table
         */
        public void execute();


        /**
         * Show the instruction using text so it can be understood by a person
         *
         * @return String - A short string describing what this instruction will do
         */
        @Override
        public String toString();

    }


    ////////////////////////////////////////////////
    ////////////     Public Classes     ////////////
    ////////////////////////////////////////////////


    /**
     * The ADD instruction
     */
    public static class Add implements Instruction{

        //Run the microsteps for the ADD Instruction
        @Override
        public void execute() {
            int op2 = stack.pop();
            int op1 = stack.pop();
            stack.push( op1 + op2 );
        }

        //Show the ADD instruction as plain text
        //@return "ADD"
        @Override
        public String toString() {
            return "ADD";
        }
    }

    /**
     * The DIVIDE instruction
     */
    public static class Divide implements Instruction{

        //Run the microsteps for the DIVIDE Instruction
        @Override
        public void execute() {

        }

        //Show the DIVIDE instruction as plain text
        @Override
        public String toString() {
            return null;
        }
    }

    /**
     * The LOAD instruction
     */
    public static class Load implements Instruction{

        //Run the microsteps for the LOAD Instruction
        @Override
        public void execute() {

        }

        //Show the LOAD instruction as plain text
        @Override
        public String toString() {
            return null;
        }
    }

    /**
     * The MULTIPLY instruction
     */
    public static class Multiply implements Instruction{

        //Run the microsteps for the MULTIPLY Instruction
        @Override
        public void execute() {

        }

        //Show the MULTIPLY instruction as plain text
        @Override
        public String toString() {
            return null;
        }
    }

    /**
     * The NEGATE instruction
     */
    public static class Negate implements Instruction{

        //Run the microsteps for the NEGATE Instruction
        @Override
        public void execute() {

        }

        //Show the NEGATE instruction as plain text
        @Override
        public String toString() {
            return null;
        }
    }

    /**
     * The PRINT instruction
     */
    public static class Print implements Instruction{

        //Run the microsteps for the PRINT Instruction
        @Override
        public void execute() {

        }

        //Show the PRINT instruction as plain text
        @Override
        public String toString() {
            return null;
        }
    }

    /**
     * The PUSHCONST instruction
     */
    public static class PushConst implements Instruction{

        //Run the microsteps for the PUSHCONST Instruction
        @Override
        public void execute() {

        }

        //Show the PUSHCONST instruction as plain text
        @Override
        public String toString() {
            return null;
        }
    }

    /**
     * The SQUAREROOT instruction
     */
    public static class SquareRoot implements Instruction{

        //Run the microsteps for the SQUAREROOT Instruction
        @Override
        public void execute() {

        }

        //Show the SQUAREROOT instruction as plain text
        @Override
        public String toString() {
            return null;
        }
    }

    /**
     * The STORE instruction
     */
    public static class Store implements Instruction{

        //Store the name of the target variable
        private String name;

        //Constructor
        public Store(String ident) {
            this.name = ident;
        }

        //Run the microsteps for the STORE Instruction
        @Override
        public void execute() {
            table.put( this.name, stack.pop() );
        }

        //Show the STORE instruction as plain text
        //@return "STORE" followed by the target variable name
        @Override
        public String toString() {
            return "STORE " + this.name;
        }
    }

    /**
     * the SUBTRACT instruction
     */
    public static class Subtract implements Instruction{

        //Run the microsteps for the SUBTRACT Instruction
        @Override
        public void execute() {

        }

        //Show the SUBTRACT instruction as plain text
        @Override
        public String toString() {
            return null;
        }
    }


    ////////////////////////////////////////////////
    ////////////     Public Methods     ////////////
    ////////////////////////////////////////////////


    /**
     *
     * Generate a listing of a program on standard output by calling the
     * toString() method on each instruction contained therein, in order
     *
     * @param program - a list of instructions in the program
     *
     */
    public static void displayInstructions(List<Instruction> program) {
            List< Machine.Instruction > program ) {
            System.out.println( "\nCompiled code:" );
            for ( Machine.Instruction instr: program ) {
                System.out.println( instr );
            }
            System.out.println();
    }

    /**
     * Run a "compiled" program by executing in order each instruction contained therein
     *
     * @param program - a list of Machine Instructions
     */
    public static void execute(List<Instruction> program) {
        reset();
        System.out.println("Executing compiled code...");
        for ( Instruction instr: program ) {
            instr.execute();
        }
        System.out.println( "Machine: execution ended with " +
                stack.size() + " items left on the stack." );
        System.out.println();
        Errors.dump( table );
    }
}
