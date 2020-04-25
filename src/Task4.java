public class Task4 {

    public int reduce(String number){
        String[] stringsArray = number.split("");
        Integer[] intArray=new Integer[stringsArray.length];
        int i = 0;
        for(String str : stringsArray){
            intArray[i] = Integer.parseInt(str);
            i++;
        }
        int result = 1;
        for(int num : intArray){
            result *=num;
        }
        return result;

    }

}
