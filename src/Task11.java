import java.util.Arrays;

public class Task11 {
    private int[] array;

    public Task11() {
        this.array =  new int[0];
    }

    public void add(Integer value) {
        int oldArrLength = this.array.length;
        int[] tmpArr = new int[oldArrLength + 1];
        for (int i = 0; i < this.array.length; i++) {
            tmpArr[i] = this.array[i];
        }
        tmpArr[tmpArr.length - 1] = value;
        this.array = Arrays.copyOf(tmpArr, tmpArr.length);
    }

    public void add(Integer value, int idx) {
        if (idx > this.array.length - 1) {
            add(value);
        } else {
            this.array[idx] = value;
        }

    }

    public Integer get(int idx) {
        if (idx > this.array.length - 1) {
            return null;
        } else {
            return this.array[idx];
        }
    }
    public void remove(int idx) {
        int oldArrLength = this.array.length;
        int[] tmpArr = new int[oldArrLength - 1];
        for (int i = 0; i < this.array.length; i++) {
            if (i < idx) {
                tmpArr[i] = this.array[i];
            } else if (i == idx) {
                continue;
            } else {
                tmpArr[i - 1] = this.array[i];
            }
        }
        this.array = Arrays.copyOf(tmpArr, tmpArr.length);
    }

    public void swap(int from, int to) {
    }

    public String toString() {
        return String.join(" ", Arrays.toString(this.array));
    }


}
