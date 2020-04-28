public class Task7 {
    public void displayTask7(String pesel){
        if(checkPesel(pesel)){
            System.out.println("\nPESEL is ok.");
        }
        else{
            System.out.println("\nPESEL is not ok.");

        }
    }


    private boolean checkPesel(String pesel){
        try{
            if(pesel.length() != 11){
                throw new IllegalArgumentException(
                        "Wrond input data!" +
                                "\nPESEL has to have 11 letters!");
            }
            String[] peselStringArr =  pesel.split("");
            int[] peselIntArr = new int[peselStringArr.length];
            for(int i=0; i<11; i++){
                peselIntArr[i] = Integer.parseInt(peselStringArr[i]);
                System.out.print(peselIntArr[i]);
            }

        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        //result = 1xa + 3xb + 7xc + 9xd + 1xe + 3xf + 7xg + 9xh + 1xi + 3xj + 1xk;
        /*if(result % 10 == 0){
            return true;
        }
        else{
            return false;
        }*/
        return true;
    }
}
