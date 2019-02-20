import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] intArr = {0,4,10,5,7,20};
        bubbleSort(intArr);
    }
    public static void bubbleSort(int[] arr){
        // Populate intList
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : arr) {
            intList.add(i);
        }
        // Bubble Sort
        int i = 0;
        int offset = 1;
        int temp = 0;
        while (i < intList.size() - offset && offset < intList.size()-1){
            if (intList.get(i) > intList.get(i+1)){
                temp = intList.get(i+1);
                intList.set(i+1,intList.get(i));
                intList.set(i,temp);
            }
            if (i == intList.size() - offset - 1){
                offset ++;
                i = 0;
            } else {
                i++;
            }
        }
        int[] finalArr = intList.stream().mapToInt(in->in).toArray();
        System.out.println(Arrays.toString(finalArr));
    }
}