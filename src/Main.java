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
        // two args
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
        // three args
        System.out.println("3 args:");
        System.out.println("Add: " + calc.add(5, 12,2));
        System.out.println("Subtract: " + calc.subtract(5, 12,1));
        System.out.println("Multiply: " + calc.multiply(5, 12,2));
        System.out.println("Divide: " + calc.divide(12, 2,3));
        System.out.println("Minimum: " + calc.min(-3,-10,-3));
        System.out.println("Maximum: " + calc.max(500,10,2));
        System.out.println("Average: " + calc.average(5,12,11));

        // Task10
        System.out.println("\nTask10");
        Task10 task10 = new Task10(5);
        System.out.println(task10.toString());
        System.out.println("Is Empty?: " + task10.isEmpty());
        System.out.println("Is Full?: " + task10.isFull());
        task10.push(2);
        task10.push(5);
        task10.push(7);
        task10.push(1);
        task10.push(9);
        task10.push(2);  // stack overflow
        System.out.println(task10.toString());
        System.out.println("Is Empty?: " + task10.isEmpty());
        System.out.println("Is Full?: " + task10.isFull());
        task10.pop();
        task10.pop();
        task10.pop();
        System.out.println(task10.toString());
        System.out.println("Is Empty?: " + task10.isEmpty());
        System.out.println("Is Full?: " + task10.isFull());
        task10.pushAlternative(6);
        task10.pushAlternative(9);
        task10.pushAlternative(1);
        System.out.println(task10.toString());
        System.out.println("Is Empty?: " + task10.isEmpty());
        System.out.println("Is Full?: " + task10.isFull());
        task10.popAlternative();
        task10.popAlternative();
        task10.popAlternative();
        task10.popAlternative();
        task10.popAlternative();
        System.out.println(task10.toString());
        System.out.println("Is Empty?: " + task10.isEmpty());
        System.out.println("Is Full?: " + task10.isFull());

        // Task11
        System.out.println("\nTask11");
        Task11 task11 = new Task11();
        task11.add(2);
        task11.add(7);
        task11.add(5);
        task11.add(4);
        task11.add(9);
        task11.add(222);
        task11.add(222, 0);
        task11.add(211, 10);
        System.out.println("toString: " + task11.toString());
        System.out.println("Get [3]: " + task11.get(3));
        task11.remove(2);
        System.out.println("Remove [2]: " + task11.toString());
        task11.swap(7,2);
        System.out.println("Swap [7] [2]: " + task11.toString());

        // Task12
        System.out.println("\nTask12");
        Task12Account account = new Task12Account("Millenium: Pawel Kowalski"
                ,10000, -5000);
        Task12Account account2 = new Task12Account("mBank: Andrzej Nowak"
                ,1000, -2000);
        account.deposit(1000);
        account2.deposit(5000);
        account.withdraw(200);
        account.transfer(account2, 500);
        System.out.println(account.toString());
        System.out.println(account2.toString());



    }
}
