import java.util.Arrays;

public class Task6 {
    public void convertTextMessage(String inputText){
        String [] arr = inputText.split("");
        for (int i=1; i<arr.length; i++){
            if(arr[i - 1].equals(" ")){
                arr[i] = arr[i].toUpperCase();
            }
        }
        String outputString = String.join("",arr);
        outputString = outputString.replaceAll("\\s+", "");

        System.out.println("SMS before conversion: " + inputText);
        System.out.println("Quantity of signs: " + inputText.length());
        System.out.println("Price of SMS: " + getPrice(inputText));
        System.out.println("SMS after conversion: " +outputString);
        System.out.println("Quantity of signs: " + outputString.length());
        System.out.println("Price of SMS: " + getPrice(outputString));


    }

    private String getPrice(String textMessage){
        int price = (textMessage.length() / 160) * 25;
        if(price < 1){
            price = 25;
        }
        return "\n" + price/100 + " zł " + price%100 + " gr";

    }
}
