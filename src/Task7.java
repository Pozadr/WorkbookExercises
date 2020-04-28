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
        String[] peselStringArr;
        int[] peselIntArr = new int[11];
        try{
            if(pesel.length() != 11){
                throw new IllegalArgumentException(
                        "Wrond input data!" +
                                "\nPESEL has to have 11 letters!");
            }
            peselStringArr = pesel.split("");
            peselIntArr = new int[peselStringArr.length];
            for(int i=0; i<11; i++){
                peselIntArr[i] = Integer.parseInt(peselStringArr[i]);
                System.out.print(peselIntArr[i]);
            }

        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        long result = 1*peselIntArr[0] + 3*peselIntArr[1] + 7*peselIntArr[2] + 9*peselIntArr[3]
                + 1*peselIntArr[4] + 3*peselIntArr[5] + 7*peselIntArr[6] + 9*peselIntArr[7]
                + 1*peselIntArr[8] + 3*peselIntArr[9] + 1*peselIntArr[10];
        //System.out.println("Result sum: " + result);

        if(result % 10 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
