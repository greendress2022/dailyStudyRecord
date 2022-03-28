public class Book implements Comparable<Book> {
  float price;
  String title;
}

public int compareTo(Book other){
  //usually we use return this.price - other.;
  //float price 0 cannot be achieved, which is a problem, so we specify them
  if(this.price < other.price){
    return -1;
  }
  else if(this.price > other.price){
    return 1;
  }
  return 0;

  public double getPrice(){
    return this.price;
  }
}


//if we want to compare with String
// a class can only have one comparable (single option)
//终于明白，price是float可以自身比较不用单独建个class来实现，
//but if使用其他比较标准比如title就必须使用comparator
class BookComparatorByPrice implements Comparator<T>{
  public int compare(Book one, Book two){
    if(one.getprice() < two.getprice()){
      return -1;
    }
    else if(one.getPrice() > two.getPrice()){
      return 1;
    }
    return 0;
  }
}
//String 实现了comparable
class BookComparatorByTitle implements Comparator<T>{
  public int compare(Book one, Book two){
    if(one.getTitle()<two.getTitle){
      return -1;
    }else if{
      one.getTitle() > two.getTitle){
        return 1;
    }else{
      return 0;
    }
  }
}

//use
BookComparatorByPrice priceComparator = new BookComparatorByPrice();
if(priceComparator.compare(one, two)>=0){
  return one;
}else{
  return two;
}

//binary search uses Comparator
private static <T> boolean binarySearch(T[] array, int low, int high, int value, Comparator<T> comparator){
    if(low > high){  //cross over,so element doesn't exist
      return false;
    }
  int mid = low + (high-low)/2;
  int standard = comparator.compare(value, array[mid]);
  if(standard == 0){
    return true;
  }else if(standard < 0 ){
    binarySearch(array, low，mid-1, value, comparator);
  }else{
      binarySearch(array, mid+1, high, value, comparator);
  }
}
