package Mosh;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second){
        return(first.compareTo(second)<0) ? second : first;
    }//turn this method into a generic method

    //no need to turn this class into a generic class
    //object T extends Comparable interface
    }

}

