import java.util.List;

/**
 * The main MACHINE class
 */
public class Machine {


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
        public String toString();

    }

    /**
     * The ADD instruction
     */
    public static class Add implements Instruction{

        //Constructor
        public Add() {

        }

        //Run the microsteps for the ADD Instruction
        @Override
        public void execute() {

        }

        //Show the ADD instruction as plain text
        @Override
        public String toString() {

            return null;
        }


    }

    /**
     * The DIVIDE instruction
     */
    public static class Divide implements Instruction{

        //Constructor
        public Divide() {}

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

        //Constructor
        public Load(String ident) {

        }

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

        //Constructor
        public Multiply() {
        }

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

        //Constructor
        public Negate() {
        }

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

        //Constructor
        public Print() {
        }

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

        //Constructor
        public PushConst(int constant) {
        }

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

        //Constructor
        public SquareRoot() {
        }

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

        //Constructor
        public Store(String ident) {
        }

        //Run the microsteps for the STORE Instruction
        @Override
        public void execute() {

        }

        //Show the STORE instruction as plain text
        @Override
        public String toString() {
            return null;
        }
    }

    /**
     * the SUBTRACT instruction
     */
    public static class Subtract implements Instruction{

        //Constructor
        public Subtract() {
        }

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


    /**
     * Generate a listing of a program on standard output by calling the
     * toString() method on each instruction contained therein, in order
     */
    public static void discplayInstructions(List<Machine.Instruction> Program) {


    }

    /**
     * Run a "compiled" program by executing in order each instruction contained therein
     */
    public static void execute() {


    }
}
