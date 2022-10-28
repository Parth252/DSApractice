import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ElasticArray elasticArray = new ElasticArray(3);
        elasticArray.insert(10);
        elasticArray.insert(20);
        elasticArray.insert(30);
        elasticArray.insert(30);
        elasticArray.insert(50);
        System.out.println(elasticArray.indexOf(300));
//        System.out.println(elasticArray.count);
    }
}