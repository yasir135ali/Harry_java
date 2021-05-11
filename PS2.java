import java.util.Scanner;
public class PS2 {
    public static void main(String[]args){
        float a=7/4.0f*9/2.0f;
        System.out.println(a);
        char grade='B';
        grade= (char)(grade+8);
        System.out.println("Encrypt : "+grade);
        grade=(char)(grade-8);
        System.out.println("Decrypt : "+grade);

//        Scanner A =new Scanner(System.in);
//        System.out.println("Enter The Number :");
//        int b =A.nextInt();
//        System.out.println(10>b);
        float x;
        int V=2;
        int u,A,s;
        u=1;
        A=4;
        s=3;
        x=(V*V-u*u)/(2.0f*A*s);
        System.out.println(x);

    }
}
