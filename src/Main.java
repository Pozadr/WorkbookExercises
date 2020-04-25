public class Main {
    public static void main(String[] args){
        // Task 1, 2
        Task1_2.display();
        // Task3
        Task3 task3 = new Task3();
        task3.displayA(8);
        task3.displayB(8);
        task3.displayC(8);
        task3.displayD(8);
        task3.displayE(8);
        task3.displayF(7);
        task3.displayG(7);
        task3.displayH(7);
        task3.displayI(7);
        // Task4
        System.out.println();
        Task4 task4 = new Task4();
        String numberToReduce = "202020";
        int reducedValue = task4.reduce(numberToReduce);
        System.out.println("Number to reduce: " + numberToReduce);
        System.out.println("After reduce: " + reducedValue);


    }
}
