import java.util.ArrayList;
import java.util.Random;

public class ArrayTest {

    public static void addItemToArray(ArrayList<Integer> arr, int item){
        arr.add(item);
    }

    public static void addToMulti(ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> item){
        arr.add(item);
    }

    public static void clearArray(ArrayList<Integer> arr){
        arr.clear();
    }

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<ArrayList<Integer>> multiArray = new ArrayList();
        ArrayList<Integer> myArray = new ArrayList();
        int randomNum;

        for(int i = 0; i < 5; i++){
            clearArray(myArray);
            for(int range = 0; range < 5; range++){
                randomNum = random.nextInt(10 - 1 + 1) + 1;
                addItemToArray(myArray, randomNum);
            }
            System.out.println(myArray);
            multiArray.add(myArray);
        }
        System.out.println(multiArray);
    }
}
