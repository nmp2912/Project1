import java.util.List;

/**
 * The main MACHINE class
 */
public class Machine {


    /**
     * The instructions interface
     */
    public static interface Instruction {

        //Run this instruction on the Machine, using the Machine's value stack and symbol table
        public void execute();

        //Show the instruction using text so it can be understood by a person
        public String toString();

    }

    /**
     * The LOAD instruction
     */
    private static class Load {


    }

    /**
     * The ADD instruction
     */
    private static class Add {


    }

    /**
     * The DIVIDE instruction
     */
    private static class Divide {


    }

    /**
     * The MULTIPLY instruction
     */
    private static class Multiply {


    }

    /**
     * The NEGATE instruction
     */
    private static class Negate {


    }

    /**
     * The PRINT instruction
     */
    private static class Print {


    }

    /**
     * The PUSHCONST instruction
     */
    private static class PushConst {


    }

    /**
     * The SQUAREROOT instruction
     */
    private static class SquareRoot {


    }

    /**
     * The STORE instruction
     */
    private static class Store {


    }

    /**
     * the SUBTRACT instruction
     */
    private static class Subtract {


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
