import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ElasticArray elasticArray = new ElasticArray(10);
        elasticArray.insert(10);
        elasticArray.insert(20);
        elasticArray.insert(30);
        elasticArray.insert(30);
        elasticArray.insert(50);
        elasticArray.reverse();
        elasticArray.print();


//        ElasticArray elasticArray1 = new ElasticArray(1);
//        elasticArray1.insert(20);
//        elasticArray1.insert(30);
//        elasticArray1.insert(3);
//        elasticArray.intersect(elasticArray1).print();
//        System.out.println(elasticArray.count);
    }
}