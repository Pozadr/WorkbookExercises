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
        // Task7
        System.out.println("\nTask7");
        Task7 task7 = new Task7();
        task7.displayTask7("90121411721");
        // Task8Car
        System.out.println("\nTask8");
        Task8Car audi = new Task8Car();
        audi.setModel("A8");
        audi.setColor("czerwony");
        audi.setProductionYear(2018);
        System.out.println(audi.getModel());
        System.out.println(audi.getColor());
        System.out.println(audi.getProductionYear());
        System.out.println("Mielage: " + audi.getMileage());
        System.out.println("Used? " + audi.isUsed());
        audi.drive(100);
        System.out.println("Mielage: " + audi.getMileage());
        audi.drive(53600);
        System.out.println("Mielage: " + audi.getMileage());
        System.out.println("Used? " + audi.isUsed());

        // Task9Calculator
        System.out.println("\nTask9");
        Task9Calculator calc = new Task9Calculator();
        System.out.println("Add: " + calc.add(5, 12));
        System.out.println("Subtract: " + calc.subtract(5, 12));
        System.out.println("Multiply: " + calc.multiply(5, 12));
        System.out.println("Divide: " + calc.divide(12, 2));
        System.out.println("Is Positive?: " + calc.isPositive(-5));
        System.out.println("Is Negative?: " + calc.isNegative(5));
        System.out.println("Is Odd?: " + calc.isOdd(4));
        System.out.println("Minimum: " + calc.min(-3,-10));
        System.out.println("Maximum: " + calc.max(500,10));
        System.out.println("Average: " + calc.average(5,12));
        System.out.println("Power: " + calc.power(2,10));




    }
}
