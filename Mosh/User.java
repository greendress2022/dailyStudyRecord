
package Mosh;


public class User implements Comparable<User> {
    private int points;//use constructor to initialize it
    public User(int points){
        this.points=points;
    }

    @Override
    public int compareTo(User other) {
        //this < o ->negative value
        //this == o -> 0
        // this > o -> 1
        return this.points-other.points;
    }

    @Override
    public String toString() {
        return "User points=" + points;
    }
}
