import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P {
    //M5 L5 search in a list
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(111);
        System.out.println("find at index= " + P.find(list, 20));
    }

    //linear search a list
    public static <K> int find(List<K> list, K value) {
        int i = 0;
        while (i < list.size() && (!list.get(i).equals(value))) {
            i = i + 1;
        }
        if (i < list.size()) {
            //this should be ok, meaning there's an element value equals to the value given
            //if(list.get(i).equals(value)) is not right because of indexoutofbound
            return i;
        }
        return -1;
    }
    //O(n)

    //binary search a list, <T> is used to declare T
    public static <T> boolean binarySearch(T[] array, int low, int high, T value, Comparator<T> comparator){
        if(low > high){
            return false;//cross over,element doesn't exist
        }
        int mid = low+(high-low)/2;
        int compareValue = comparator.compare(value, array[mid]);
        if(compareValue==0){
            return true;
        }else if(compareValue < 0){ //lesser than mid
            return binarySearch(array, low, mid-1,value,comparator);
        }else{
            return binarySearch( array, mid+1, high,value,comparator);

        }
    }
}