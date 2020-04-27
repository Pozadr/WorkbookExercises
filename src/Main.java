public class Main {
    public static void main(String[] args){
        // Task 1, 2
        System.out.println("\nTask1,2");
        Task1_2.display();
        // Task3
        System.out.println("\nTask3");
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
        System.out.println("\nTask4");
        Task4 task4 = new Task4();
        String numberToReduce = "202020";
        int reducedValue = task4.reduce(numberToReduce);
        System.out.println("Number to reduce: " + numberToReduce);
        System.out.println("After reduce: " + reducedValue);
        // Task5
        System.out.println("\nTask5");
        Task5 task5 = new Task5();
        task5.displayWhoWon("XXXXoxoxoxXXXXX0000xxxx");
        // Task6
        System.out.println("\nTask6");
        Task6 task6 = new Task6();
        task6.convertTextMessage("Ala ma kota, a kot ma Alę !");



    }
}
