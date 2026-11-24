import java.util.*;

public class javaclass2_Assessment {
    public static void main(String[] args) {
        ArrayList<String>arr= new ArrayList<>();
        arr.add("Harsh");
        arr.add("Rahul");
        arr.add("dev");
        arr.add("yash");
        arr.add("vimal");
        System.out.println(arr.get(1));
        arr.remove(2);
        arr.set(2,"piyush");
        System.out.println(arr.contains("Harsh"));
        System.out.println(arr.size());

    }
}
