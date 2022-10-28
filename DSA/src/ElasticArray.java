import java.util.Arrays;

public class ElasticArray {
    int length;
    int[] array;
    int count = 0;
    public ElasticArray(int length) {
        this.length = length;
        array = new int[length];
    }
    public void insert(int integer){
        if (count == length) {
            length = count*2;
            int[] newArray = new int[length];
            for (int i = 0; i < count; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[count++] = integer;
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public void remove(int index){
        if (index>=count||index<0){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < count; i++) {
            array[i] = array[i+1];
        }
        count--;
    }

    public int indexOf(int integer){
        for (int i = 0; i < count; i++) {
            if (array[i]==integer) return i;
        }
        return -1;
    }


}
