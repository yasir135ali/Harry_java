import java.util.Scanner;
public class String_methods {
    public static void main(String[]args){
        String name="Yasir5";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name);
        String U_name=name.toUpperCase();
        System.out.println(U_name);
        System.out.println(name.toLowerCase());
        System.out.println(name);
        Scanner A=new Scanner(System.in);
//        String a=A.next();
//        System.out.println(a);
        String Full_Name="  Yasir Ali  ";
        System.out.println(Full_Name.trim());
        System.out.println(Full_Name);

        System.out.println(name.substring(2));

        System.out.println(name.substring(1,3));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('Y','O'));
        System.out.println(name.replace("Yasir","Ali"));
        System.out.println(name);

        System.out.println(name.startsWith("as"));
        System.out.println(name.endsWith("ir"));

        System.out.println(name.charAt(1));
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(5));

        System.out.println(name.indexOf('r'));

        String names="Yasiryasir";
        System.out.println(names.indexOf("ir",4));
        System.out.println(names.lastIndexOf("ir"));
        System.out.println(names.lastIndexOf("ir",7));
        System.out.println();

        System.out.println(name.equals("Yasir5"));
        System.out.println(name.equalsIgnoreCase("yasiR5"));

        System.out.println("My Name Is \\\\Yasir Ali");
        System.out.println("My Name Is \nYasir Ali");
        System.out.println("My Name Is \"Yasir Ali");
        System.out.println("My Name Is\tYasir Ali");
        System.out.println("My Name Is\'Yasir Ali");


    }
}
