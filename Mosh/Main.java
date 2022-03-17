package Mosh;

public class Main {
    public static void main(String[] args) {
//        var user1 = new User(10);
//        var user2 = new User(20);
//        // user1< user2 is not allowed, < can only be used to compare nums and characters
//        if(user1.compareTo(user2) < 0){
//            System.out.println("user1 < user2");
//        }else if(user1.compareTo(user2)==0){
//            System.out.println("user1 = user2");
//        }else{
//            System.out.println("user1 > user2");
//        }

        var max = Utils.max(1,2);
        System.out.println(max);
        var userpoints =Utils.max(new User(1),new User(2));
        System.out.println(userpoints);
        //when we pass an object to println method
        //toString method on that object gets called


        var result = Utils.max("ABS","ABS");
        System.out.println(result);

    }
}
