package selection;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 8, 0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : i;
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
//    public static void selectionSort(int arr[]){
//        int minIndex = 0;
//        int min = arr[0];
//        for (int j = 0+1; j <arr.length ; j++) {
//            if(min>arr[j]){
//                min = arr[j];
//                minIndex = j;
//            }
//        }
//        //place min at arr[0]
//        if(minIndex!=0) {
//            arr[minIndex] = arr[0];
//            arr[0] = min;
//        }
//        System.out.println("after first round\n");
//        System.out.println(Arrays.toString(arr));
//    }

}