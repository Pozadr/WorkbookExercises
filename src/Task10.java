public class Task10 {
    private final int[] tab;
    private int stockElementRef = 0;

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
                    this.stockElementRef++;
                    break;
                }
            }
        }
    }

    public void pushAlternative(Integer e){
        if (stockElementRef == this.tab[this.tab.length - 1]){
            System.out.println("Stack overflow with " + e);
        }
        else{
            this.tab[stockElementRef] = e;
            System.out.println("Added: " + this.tab[stockElementRef]);
            this.stockElementRef++;
            }
    }


    public void pop() {
        if (this.tab[0] == 0){
            System.out.println("Stack is empty." );
        }
        else{
            for (int i=this.tab.length - 1; i>=0 ; i--) {
                if(this.tab[i] != 0){
                    System.out.println("Pop: " + this.tab[i]);
                    this.tab[i] = 0;
                    this.stockElementRef--;
                    break;
                }
            }
        }
    }

    public void popAlternative(){
        if (this.tab[0] == 0){
            System.out.println("Stack is empty." );
        }
        else{
            System.out.println("Pop: " + this.tab[stockElementRef - 1]);
            this.tab[stockElementRef - 1] = 0;
            stockElementRef--;
        }
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
