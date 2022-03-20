package listsetmap;

import java.util.HashSet;
import java.util.Objects;

public class HashsetPrac {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("Lisa",29));
        employees.add(new Employee("Lisa",29));
        employees.add(new Employee("Kiki",19));
        System.out.println(employees);
        //1.先比较哈希值，2.再比较equals，这里两个objects，哈希值不一样，肯定算出来的索引值不同
        //如果name,age相同则返回相同的hashcode
        //equals比下来如果相等，就不添加，否则可以添加
        //result:line 9 will not be added because  hashCode(),equals(Object o) have been overridden
        //these objects have the same hasocode and is supposed to be the same
    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}