import java.util.HashSet;

public class class2Assisment2 {
    public static void main(String[] args) {
        HashSet<Integer> st1= new HashSet<>();
        HashSet<Integer> st2= new HashSet<>();
        st1.add(12);
        st1.add(20);
        st1.add(25);

        st2.add(50);
        st2.add(55);
        st2.add(60);
        st1.addAll(st2);
        st1.retainAll(st2);
        st1.removeAll(st2);




    }
}
