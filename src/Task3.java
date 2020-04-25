public class Task3 {

    // Triangle 1
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


    // Triangle 2
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


    // Triangle 3
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


    // Triangle 4
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


    // Square
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


    // Letter 'S'
    public void displayF(int size){
        System.out.println();
        for(int i=1; i<=size; i++){
            if(i==1 || i == size){
                for (int j=1; j<=size; j++) {
                    System.out.print("# ");
                }
            }
            else {
                for (int j=1; j<=size; j++) {
                    if (j == i) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }


    // Letter 'Z'
    public void displayG(int size){
        System.out.println();
        for(int i=1; i<=size; i++){
            if(i==1 || i == size){
                for (int j=1; j<=size; j++) {
                    System.out.print("# ");
                }
            }
            else {
                for (int j=1; j<=size; j++) {
                    if (j == size - i + 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }


    // Hourglass
    public void displayH(int size){
        System.out.println();
        for(int i=1; i<=size; i++){
            if(i==1 || i == size){
                for (int j=1; j<=size; j++) {
                    System.out.print("# ");
                }
            }
            else {
                for (int j=1; j<=size; j++) {
                    if (j == i || j == size - i + 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }


    // Square with diagonals



}
