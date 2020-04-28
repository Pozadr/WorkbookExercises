import java.util.Arrays;

public class Task10 {
    private int[] tab;

    public Task10(int count) {
        this.tab = new int[count];
    }

    public void push(Integer e) {
        if (this.tab[this.tab.length - 1] != 0){
            System.out.println("Stack overflow with " + e);
        }
        else{
            for (int i=0; i< this.tab.length; i++) {
                if(this.tab[i] == 0){
                    this.tab[i] = e;
                    System.out.println("Added: " + this.tab[i]);
                    break;
                }
            }
        }
    }

    public Integer pop() {
        for (int i = this.tab.length - 1; i >= 0; i--) {
            if (this.tab[i] == 0) {
                //this.tab[i] = e;
                break;
            }
        }
        return 0;
    }

    public boolean isEmpty() {
        for (Integer i : this.tab) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        for (Integer i : this.tab) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String result;
        String[] resultStringTab = new String[this.tab.length];
        for (int i=0; i<this.tab.length; i++){
            resultStringTab[i] = Integer.toString(this.tab[i]);
        }
        result = String.join(" ",resultStringTab);
        return result;
    }
}
