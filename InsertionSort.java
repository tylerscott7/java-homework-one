import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] intArr = {0,4,10,5,7,20};
        insertSort(intArr);
    }
    public static void insertSort(int[] arr){
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : arr) {
            intList.add(i);
        }
        // Insertion Sort
        int numToSort = 0;
        for (int i=1; i<intList.size();i++){
            numToSort = intList.get(i);
            for (int j=0; j<i; j++){
                if (numToSort < intList.get(j)){
                    intList.add(j,numToSort);
                    intList.remove(i+1);
                    break;
                }
            }
        }
        int[] finalArr = intList.stream().mapToInt(in->in).toArray();
        System.out.println(Arrays.toString(finalArr));
    }
}