public class Task4 {

    public int reduce(String number){
        String[] stringsArray = number.split("");
        Integer[] intArray=new Integer[stringsArray.length];
        int i = 0;
        for(String str : stringsArray){
            try{
                intArray[i] = Integer.parseInt(str);
                i++;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Not a number: "
                        + str + " at index " + i, e);
            }
        }
        int result = 1;
        for(int num : intArray){
            if(num == 0){
                continue;
            }
            result *=num;
        }
        return result;

    }

}
