import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    int[] array = {1,4,6,2,2};
    sorter(array);
    System.out.println(Arrays.toString(array));
  }
  public static void sorter(int[] array){
    for (int i = 1;i < array.length ;i++ ) {
      int current = array[i];
      int j = i - 1;
      while(j>=0 && array[j] > current){
        array[j+1] = array[j];
        j--;
      }
      array[j+1] = current;
    }

  }
}
