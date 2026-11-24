import java.util.*;
public class javaclass2 {


    public static class A{   //non generic class
        int v;
        A(int v){
            this.v= v;


        }
        int result(){
            return v;
        }
    }

    public static class B<T>{     //generic class     T can be any wrapper class
        T v;
        B(T v){
            this.v =v;
        }

        T result(){
            return v;
        }
    }
    // class - class extends
    //interface --interface  extends
    // class --interface  impliments

    public static void main(String[] args) {
        B <Integer>obj= new B<>(56);  //object of generic class
        System.out.println(obj.result());
        B <String>obj2 =new B("hello");
        System.out.println(obj2.result());

        int a =10;  //primitive data type
        Integer b =10; //object b created , wrapperclass -- Integer

        Integer c= a; //auto-boxing
        int d =c;  //unboxing
        int n= Integer.parseInt("213");
        Integer y= Integer.valueOf(d);
        /// collections FrameWork/////
        ArrayList<Integer>arr= new ArrayList<>();  //default size =10
        //capacity --initial length ---10
        //size()--current lentgth--0(initially)
        arr.add(12);
        arr.size();
        arr.get(0);
        arr.remove(0);
        int x =15;
        arr.add(x);  //autoboxing  int -- Integer
        arr.set(1,25);
        arr.add(0,36);
        //priority,arrdeque,Hashset,




    }
}
