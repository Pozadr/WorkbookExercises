public class Task1_2 {
    public static void display(){
        for(int i=1; i<=10; i++){
            dispalyRowSeparator(10);
            for(int j=1; j<=10; j++){
                if(j==1 && i*j < 10){
                    System.out.print(String.format("%4s", "| " + i*j + " |"));
                }
                else if(j==1 && i*j >= 10 && i*j<100){
                    System.out.print(String.format("%4s", "|" + i*j + " |"));
                }
                else if(j!=1 && i*j < 10 && i*j<100){
                    System.out.print(String.format("%4s", " " + i*j + " |"));
                }
                else if(j!=1 && i*j >= 10 && i*j<100){
                    String format = String.format("%4s", " " + i * j + "|");
                    System.out.print(format);
                }
                // 100
                else{
                    System.out.print(String.format("%4s", i*j + "|"));
                }
                if(j==10){
                    System.out.println();
                }
            }
        }
    }
    private static void dispalyRowSeparator(int counter){
        for(int i=1; i<=counter; i++){
            System.out.print(String.format("%4s", "+---"));
            if(i==10){
                System.out.print("+");
                System.out.println();
            }
        }
    }
}
