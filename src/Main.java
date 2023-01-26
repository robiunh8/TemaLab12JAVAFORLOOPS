public class Main {
    public static void main(String[] args) {

        LogicalOPtema logicalForLoop= new LogicalOPtema();

        // ex 1
        System.out.println("EX 1");
        logicalForLoop.countTo100(90);

        //ex 2
        System.out.println(" ");
        System.out.println("EX 2");
        logicalForLoop.countToMinus100(-90);

        //ex 3
        System.out.println(" ");
        System.out.println("EX 3");
        logicalForLoop.countFirstIntToSecondInt(5,10);

        //ex 4
        System.out.println(" ");
        System.out.println("EX 4");
        logicalForLoop.countBetweenFirstAndLast(10,2);

        //ex 5
        System.out.println(" ");
        System.out.println("EX 5");
        logicalForLoop.printEvenNr();

        //ex 6
        System.out.println(" ");
        System.out.println("EX 6");
        logicalForLoop.printOddNr();

        //ex 7
        System.out.println(" ");
        System.out.println("EX 7");
        System.out.println(logicalForLoop.sumFromNrTo100(50));

        //ex 8
        System.out.println(" ");
        System.out.println("EX 8");
        System.out.println(logicalForLoop.ForLoopAverage());

        //ex 9
        System.out.println(" ");
        System.out.println("EX 9");
        System.out.println(logicalForLoop.printstarsForLoop());

    }
}