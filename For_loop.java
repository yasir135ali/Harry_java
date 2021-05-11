import java.util.Scanner;

public class For_loop {
    public static void main(String[]args){
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("Odd Numbers : ");
        for (int i=1;i<=15;i+=2){
            System.out.println(i);
        }
        System.out.println("With formula Odd Numbers");
        for (int i=0;i<5;i++){
            System.out.println(2*i+1);
        }
        System.out.println("reverse Loop");
//        for (int i=5;i>0;i--){
//            System.out.println(i);
//        }
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        for (int i=n;i>0;i--){
            System.out.println(i);
        }
    }
}
