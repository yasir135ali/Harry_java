import java.sql.SQLOutput;
import java.util.Scanner;
public class inputs {
    public static void main(String[]args){
        System.out.println("<-- ITS WORK -->!");
        Scanner S=new Scanner(System.in);
//        System.out.println("Adding Two Numbers");
//        System.out.println();
//        System.out.println("Enter First Number ");
//        int a =S.nextInt();
//        System.out.println("Enter Second Number ");
//        int b=S.nextInt();
//        int sum=a+b;
//        System.out.println("Sum of Two Number is ");
//        System.out.println(sum);
//        System.out.println("Enter a float Number 1");
//        float a1=S.nextFloat();
//        System.out.println("Enter a float Number 2");
//        float b1=S.nextFloat();
//        float sum1=a1+b1;
//        System.out.println(sum1);
//        System.out.println("Enter Int number Only");
//        boolean bol=S.hasNextInt();
//        System.out.println(bol);
//        System.out.println("Enter A String");
//        String str=S.next();
//        System.out.println(str);
    //Read All String & Line
//        System.out.println("Enter String To read All");
//        String str1=S.nextLine();
//        System.out.println(str1);
// Exercise TO Find A percentage
        System.out.println("Enter Your Maths Number Out of 100");
        byte math=S.nextByte();
        System.out.println("Enter Your Physics Number Out of 100");
        byte physics=S.nextByte();
        System.out.println("Enter Your Chemistry Number Out of 100");
        byte chemistry=S.nextByte();
        System.out.println("Enter Your Urdu Number Out of 100");
        byte urdu=S.nextByte();
        System.out.println("Enter Your English Number Out of 100");
        byte english=S.nextByte();
        System.out.println("Your Obtain Percentage Is :");
        float pntage;
        pntage=((math+chemistry+physics+urdu+english)*100)/500f;
        System.out.println(pntage);




    }
}
