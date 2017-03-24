/**
 * Created by psinha on 3/23/17.
 */
public class FirstExample {

    public static void main(String args[]){
        Greetings greetings = (int a, int b) -> a + b;
        System.out.println(greetings.add(2,3));

    }
}

interface Greetings {
    int add (int a, int b);
}


