import java.util.Scanner;
public class Strings {
    public static void main(String[]args){
        String name=new String("Yasir ALi");
        System.out.println(name);
        String names="Yasir ALi";
        System.out.print("MY Name Is : ");
        System.out.println(names);
        int a=6;
        float b=2.99f;
        System.out.printf("The int is %d and float is %f",a,b);
        System.out.println();
        System.out.format("The int is %d and float is %f",a,b);
        System.out.println();
        Scanner st=new Scanner (System.in);
        System.out.println("Enter String");
        String s=st.nextLine();
        System.out.println(s);

    }
}
