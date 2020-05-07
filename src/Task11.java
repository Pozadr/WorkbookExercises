import java.util.Arrays;

public class Task11 {
    private int[] array;

    public Task11() {
        this.array =  new int[0];
    }

    public void add(Integer value) {
        int oldArrLength = this.array.length;
        int[] tmpArr = new int [oldArrLength + 1];
        for (int i = 0; i < this.array.length; i++){
            tmpArr[i] = this.array[i];
        }
        tmpArr[tmpArr.length - 1] = value;
        this.array = Arrays.copyOf(tmpArr, tmpArr.length);
    }

    public void add(Integer value, int idx) {
    }
    public Integer get(int idx) {
        return null;
    }
    public void remove(int idx) {
    }
    public void swap(int from, int to) {
    }

    public String toString() {
        return String.join(" ", Arrays.toString(this.array));
    }


}
