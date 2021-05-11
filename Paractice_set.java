import java.sql.SQLOutput;
import java.util.Scanner;
public class Paractice_set {
    public static void main(String[]args){
        Scanner S=new Scanner(System.in);
//        System.out.print("Enter Your English Subject Marks Out of \"100\" :");
//        int English=S.nextInt();
//        float per=(English*100.0f)/100.0f;
//        if(per<33){
//            System.out.println("You Fail");
//        }else{
//            System.out.print("Enter Your Math Subject Marks Out of \"100\" :");
//            int Math=S.nextInt();
//            float per1=(English*100.0f)/100.0f;
//            if (Math<33){
//                System.out.println("You are Fail");
//            }else{
//                System.out.print("Enter Your Physics Subject Marks Out of \"100\" :");
//                int Physics=S.nextInt();
//                float per2=(English*100.0f)/100.0f;
//                if(Physics<33){
//                    System.out.println("You Fail");
//                }else{
//                    float total=(English+Math+Physics)*100.0f/300.0f;
//                    System.out.println("Your Overall Performs :"+total);
//
//                    if (total>=40){
//                        System.out.println("You Are Pass");
//                    }else{
//                        System.out.println("You Fail");
//                    }
//
//                }
//            }
//        }
////        System.out.format("Your English Subject Obtain marks is %f ",per);
////        System.out.println();
//
//
////        System.out.format("Your Math Subject Obtain marks is %f ",per);
////        System.out.println();
//
//
////        System.out.format("Your Physics Subject Obtain marks is %f ",per);
////        System.out.println();
//            int m1,m2,m3;
//            System.out.print("Enter Your Physics Subject Marks Out of \"100\" :");
//            m1=S.nextInt();
//            System.out.print("Enter Your Math Subject Marks Out of \"100\" :");
//            m2=S.nextInt();
//            System.out.print("Enter Your English Subject Marks Out of \"100\" :");
//            m3=S.nextInt();
//
//            float avg=(m1+m2+m3)/3.0f;
//            if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//                System.out.println("You Are Pass");
//            }else{
//                System.out.println("You Are Fail");
//
//            }


//            int income;
//            float tax=0;
//            System.out.println("Enter Your Per Year Income : ");
//            income=S.nextInt();
//            if (income>250000 && income<=500000){
//                float a;
//                a= (income-250000)*0.05f;
//                tax=tax+a;
//            }else if (income >500000 && income<=1000000){
//                tax=tax+(((500000-250000)*0.05f));
//                tax=tax+((income-500000)*0.2f);
//            }else if (income>1000000 ){
//                tax=tax+(((500000-250000)*0.05f));
//                tax=tax+((1000000-500000)*0.2f);
//                tax=tax+((income-1000000)*0.3f);
//            }else{
//                tax=0;
//            }
//            System.out.println("Your Income Is : "+tax);
//

//        int a;
//        a=S.nextInt();
//        switch (a){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Your Enter number Out of range Please \nenter Between" +
//                        "1-7 ");
//        }
//        System.out.println("Enter A Year You want To Cheak ");
//        int a=S.nextInt();
//        if (a%4==0){
//            System.out.println("This is a Leap Year");
//        }else {
//            System.out.println("No , its not a leap Year");
//        }
        System.out.println("Enter Your Url : ");
        String s=S.nextLine();
//        boolean a=s.endsWith(".com");
        if (s.endsWith(".com")){
            System.out.println("Comerical web");
        }else if(s.endsWith(".org")){
            System.out.println("International");
        }else if(s.endsWith(".pk")){
            System.out.println("For Pakistan");
        }else{
            System.out.println("Not Define");
        }
    }
}
