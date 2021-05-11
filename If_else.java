import java.util.Scanner;
public class If_else {
    public static void main(String[]args){
        int a=10;
        if (a>9){
            System.out.println("a is smaller than ten");
        }else{
            System.out.println("a is greater");
        }
        if (a==20){
            System.out.println("Yasir");

        }else if(a<10){
            System.out.println("Ali");
        }else{
            System.out.println("Yasir Ali");
        }
        boolean con=(a==20);
        if (con){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        boolean N=true;
        boolean Y=false;
        if (N==true && Y==true){
            System.out.println("And Statement Work");
        }
        boolean aa,b,c;
        aa=true;
        b=true;
        c=true;
        if (aa && b && c){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        if (N || Y){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.print("Not (N) is ");
        System.out.println(!N);
        System.out.print("Not (Y) is ");
        System.out.println(!Y);
        int x=50;
        Scanner X=new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        x=X.nextInt();
        if (x>50){
            System.out.println("You Are Expirenced");
        }else if(x>40){
            System.out.println("You Are Semi");
        }
        else if(x>30){
            System.out.println("You are semi-semi");
        }
        else{
            System.out.println("YOu are not expirenced");
        }
    }
}
