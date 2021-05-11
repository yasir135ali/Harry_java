import java.util.Scanner;
public class Harry{

    static void print(String a){
        System.out.println(a);
    }
    static void print(float a){
        System.out.println(a);
    }
    public static void main(String[]args){
        System.out.println("Welcome to the Course of Harry");
        int a=3;
        float b=2.4f;
        byte c=4;
        float z=a+b+c;
        System.out.println(z);
        print(z);
        print("i will defined a funtion");
        System.out.print("Sum of number is :"+z);
        print("yasir");
        print("ali");
        char chr= 'A';
        byte by=13;
        short shr=123;
        int a1=1234567;
        long lg = 123L;
        float fl=12.34f;
        double d= 12.341d;
        String str="Yasir";
        boolean bol=true;
        Boolean bo=false;
        print(str);
        System.out.println(bo);
        Scanner S=new Scanner(System.in);
        System.out.println("intput First NUmber ");
        int in=S.nextInt();
        System.out.println("Input Second Number");
        int in_b=S.nextInt();
        int sum=in+in_b;
        System.out.println("sum of numbers is");
        System.out.println(sum);







    }
}
