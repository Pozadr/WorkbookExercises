public class Task5 {

    public void displayWhoWon(String gameStatus){
        String result = "";
        String[] inputToArray = gameStatus.split("");

        // write game status to two dimensional array
        // more than 9 signs will be cut because of 3x3 size of array
        String [][] twoDimensionalArray = new String [3][3];
        int inputToArrayCounter = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                // check and convert: x, o, X, O
                if (inputToArray[inputToArrayCounter].equals("x")){
                    inputToArray[inputToArrayCounter] = "X";
                }
                else if (inputToArray[inputToArrayCounter].equals("o")
                    || inputToArray[inputToArrayCounter].equals("0")){
                    inputToArray[inputToArrayCounter] = "O";
                }
                // write sign to two dimensional array
                twoDimensionalArray[i][j] = inputToArray[inputToArrayCounter];
                //display game status from two dimensional array
                System.out.print(twoDimensionalArray[i][j]);
                //increase one dimensional array iterator
                inputToArrayCounter++;
            }
            // go to the next row for next 'i'
            System.out.println();
        }

        // check
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            // check rows
            if (twoDimensionalArray[i][0].equals(twoDimensionalArray[i][1])
                    && twoDimensionalArray[i][1].equals(twoDimensionalArray[i][2])) {
                result = twoDimensionalArray[i][i];
            }
            // check columns
            else if (twoDimensionalArray[0][i].equals(twoDimensionalArray[1][i])
                    && twoDimensionalArray[1][i].equals(twoDimensionalArray[2][i])) {
                result = twoDimensionalArray[i][i];
            }
        }

        // check diagonals
        if (twoDimensionalArray[0][0].equals(twoDimensionalArray[1][1])
                && twoDimensionalArray[1][1].equals(twoDimensionalArray[2][2])) {
            result = twoDimensionalArray[0][0];
        }
        else if (twoDimensionalArray[0][2].equals(twoDimensionalArray[1][1])
                && twoDimensionalArray[1][1].equals(twoDimensionalArray[2][0])) {
            result = twoDimensionalArray[1][1];
        }

        // display result
        if (!result.equals("")){
            System.out.println("The winner is: " + result);
        }
        else {
            System.out.println("There is a draw!");
        }



    }


}
