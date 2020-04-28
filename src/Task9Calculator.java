public class Task9Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        try{
            if(b == 0){
                throw new IllegalArgumentException(
                        "Don't divide thru 0.");
            }
            return a / b;
        } catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public boolean isPositive(int a) {
        return a > 0;
    }

    public boolean isNegative(int a) {
        return a < 0;
    }

    public boolean isOdd(int a) {
        return a%2 !=0;
    }

    public int min(int a, int b) {
        if (a < b){
            return a;
        }
        else {
            return b;
        }
    }

    public int max(int a, int b) {
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }

    public double average(int a, int b) {
        return (double) ((a + b) / 2);
    }

    public int power(int a, int m) {
        int result = 1;
        for (int i=1; i<=m; i++){
            result *= a;
        }
        return result;
    }




}
