import javafx.concurrent.Task;

public class Task3 {

    public void displayA(int size){
        System.out.println();
        for(int i=1; i<=size; i++){
            for (int j=1; j <= i; j++){
                String format = String.format("%2s", "# ");
                System.out.print(format);
            }
            System.out.println();
        }
    }

    public void displayB(int size){
        System.out.println();
        for(int i=size; i>0; i--){
            for (int j=i; j > 0; j--){
                String format = String.format("%2s", "# ");
                System.out.print(format);
            }
            System.out.println();
        }
    }

    public void displayC(int size){
        System.out.println();
        for(int i=1; i<=size; i++){
            for (int j=1; j <= size-i; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++) {
                String format = String.format("%2s", "# ");
                System.out.print(format);
            }
            System.out.println();
        }
    }

    public void displayD(int size){
        System.out.println();
        for(int i=size; i>0; i--){
            for (int j=1; j <= size-i; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++) {
                String format = String.format("%2s", "# ");
                System.out.print(format);
            }
            System.out.println();
        }
    }

    public void displayE(int size){
        System.out.println();
        for(int i=1; i<=size; i++){
            if(i==1 || i == size){
                for (int j=1; j<=size; j++) {
                    System.out.print("# ");
                }
            }
            else {
                for (int j=1; j<=size; j++) {
                    if (j == 1 || j == size) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }


}
