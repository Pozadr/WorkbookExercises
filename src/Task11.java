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
        if (from >= 0 && to <= this.array.length - 1
                && from <= this.array.length - 1) {
            int tmpValue = this.array[to];
            this.array[to] = this.array[from];
            this.array[from] = tmpValue;
        } else if (from > this.array.length - 1) {
            System.out.println("There is no value on " + from
                            + " position. Array will be extended by 1 to "
                            + (this.array.length) + " with value 0.");
            add(0);
            swap(from, to);
        } else if (from >= 0 && to > this.array.length - 1) {
            System.out.println("There is no value on " + to
                    + " position. Array will be extended by 1 to "
                    + (this.array.length) + " with value 0.");
            add(0);
            swap(from, to);
        } else {
            System.out.println("Failure! \"from\" input is less than 0!");
        }
    }

    public String toString() {
        return String.join(" ", Arrays.toString(this.array));
    }


}
