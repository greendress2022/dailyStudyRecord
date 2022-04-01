public class PredicateAsParameter{
  public static void main(String[] args){
    List<Integer> numList = new ArrayList(8,9,7,2,3,10,7);
    System.out.println("Test1:");
    printFilter(numList,(x) -> x>5);//condition,always true/false,X>5 will be printed
    System.out.println("Test2:");
    printFilter(numList,(x) -> true);//all will be printed
    System.out.println("Test3:");
    printFilter(numList,(x) -> false);//nothing will be printed
  }
public static void printFilter(List<Integer> nums, Predicate<Integer> condition){
  for(Integer num: nums){
    if(condition.test(num)){  //true/false,满足condition就打印
      System.out.println(num);
    }

  }
}
//predicate is a functional interface with only one method test(Object)
//lambda expression
//syntax Predicate<Type> p = condition;
Predicate<Person> person = p -> p.getAge()>30;
//use Predicate helper classes so that they can be accessed by various classes

}
// lesson code
Stream<Monster> s1 = mList.stream();
Stream<String> s2 = s1.map(e -> e.getName());
System.out.println(s2);

public String toString(){
  String result = "";
  for(Employee temp : superviseeList){
    result += temp.toString();
    result +="\n";
  }
  return this.getName()+ this.getAnnual()+this.getGender()+result;
}

addE(String name, double pay, Gender gender, String supervisorName)
Employee newEmployee = new NonManagerEmployee(name,pay,gender);
root = root.addSupervisee(supervisorName,newEmployee);

addE(Employee sentEm, String supervisorName){
  Employee newEmployee = new NonManagerEmployee(sentEm.getName(),sentEm.getPay(),sentEm.getGender());

}
Integer i = Integer.valueof(100);
Integer ii = 100; //ok,同上，自动装箱
ii= ii.intValue()+ 200;  //转成integer才能相加

public interface Generic<T>{
  void show(T t);
}
public class GenericImpl<T> implements Generic<T>{
  @Override
  public void show(T t){
    System.out.println(t);
  }
}

list.stream().filter(s -> s.startWith'L').filter(s->s.length == 3).forEach(s->System.out.println(s));
list.stream().filter(s -> s.startWith'L').filter(s->s.length == 3).forEach(System.out::println);
