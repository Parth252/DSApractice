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

    public int get(int index){
        return array[index];
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

    public int max(){
        int max =0;
        for (int i = 0; i < count; i++) {
            if (array[i]>max) max = array[i];
        }
        return max;
    }

    public ElasticArray intersect(ElasticArray elasticArray){
        ElasticArray resultArray = new ElasticArray(3);
        for (int i = 0; i < elasticArray.count; i++) {
            int currentElement = elasticArray.get(i);
            if(this.indexOf(currentElement)!=-1) resultArray.insert(currentElement);
        }
        return resultArray;
    }

    public void reverse(){
        int[] reversedArray = new int[length];
        for (int i = count; i > 0; i--) {
            int j = Math.abs(i-count);
            reversedArray[j] = array[i-1];
        }
        array=reversedArray;
    }

    public void insertAt(int index,int element){
        this.insert(element);
        for (int i = count-1; i > index; i--) {
            int temp = array[i];
            array[i] = array[i-1];
            array[i-1] = temp;
        }
    }


}
