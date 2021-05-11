import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        int a=25;
        Scanner X=new Scanner(System.in);
        System.out.print("Enter Number \"20\",\"25\",\"50\" : ");
        a=X.nextInt();
//        switch (a){
//            case (20):
//                System.out.println("You Are Young");
//                break;
//            case 25:
//                System.out.println("You want tu Get a job");
//                break;
//            case 50:
//                System.out.println("You are retired");
//                break;
//            default:
//                System.out.println("Heye! Enjoy your Life");
//        }
        switch (a) {
            case (20) -> System.out.println("You Are Young");
            case 25 -> System.out.println("You want tu Get a job");
            case 50 -> System.out.println("You are retired");
            default -> System.out.println("Heye! Enjoy your Life");
        }


    }
}
