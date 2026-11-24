//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            int a =10;
            int v= 10/0;
        }catch(ArithmeticException e){
            System.out.println("cannot divide by Zero");

        }
        System.out.println("program finished");
       ////////////////////////////////////////////////////

        try{
            int a[]={10,20,30};
            int n= a[5];

        }catch(IndexOutOfBoundsException e){
            System.out.println("this position is not in the array");
        }

        /// /////////////////////////////////////////

        try{
            String s= "";

        }catch(NullPointerException e){
            System.out.println("string has no value");


        }


        

    }
}