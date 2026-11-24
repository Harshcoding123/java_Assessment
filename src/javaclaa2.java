import java.io.*;
public class javaclaa2 {
    public static void main(String[] args) throws IOException{
        File f1= new File("abc.txt"); //object f1 of class file
       boolean fileCheck=  f1.createNewFile(); //file created
        boolean v =f1.exists();
        String s1 =f1.getName();
        String s2 =f1.getAbsolutePath();
        String s3 =f1.getPath();
        long l =f1.length();
        System.out.println(s2);
        System.out.println(s3);
        File f2= new File("C:\\Users\\HP\\Downloads\\demo (1)\\javafile.txt");//creates a fie in diff folder
        f2.createNewFile();
        String n2= f2.getAbsolutePath();
        System.out.println(n2);
       FileWriter w1= new FileWriter("abc.txt");
       w1.write("Hello Bhopal ");
//       w1.close();
        w1.write("\n Hello MP");   //  \n -- nextLine
//       w1.append("Hello LNCT");

       w1.close();
       FileReader r1= new FileReader("abc.txt");
//       int n=r1.read(); //asci value of first character in a file
//       char ch= (char)r1.read();
//        System.out.println(ch);
        String s5= "";int n=0;
        while(n!=-1){
            n =r1.read();
            s5+=(char)n;
        }

        System.out.println(s5);


//exist(), getName(),getAbsolutePath(),getPath(),length()
//class --first word capital






    }
}
