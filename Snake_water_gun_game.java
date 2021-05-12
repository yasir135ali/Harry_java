import java.util.Scanner;
import java.util.Random;
public class Snake_water_gun_game {
    public static void main(String[]args){
        Random R=new Random();
        Scanner S=new Scanner(System.in);
        int a=3;
        int i=1;
        int com=0;
        int users=0;
        while (i<=10){
            int b=R.nextInt(a);
            String win = null;
//            System.out.println(b);
            //        0 - snake , 1- water , 2- Gun
            System.out.print("0 for Snake\n1 for Water\n2 for Gun\nEnter Your Number : ");
            int user=S.nextInt();
            if (user==0 && b==1){
                win="You Win";
                users+=1;
            }
            else if (user==1 && b==2){
                win="You Win";
                users+=1;
            }else if (user==2 && b==0){
                win="You Win";
                users+=1;}
            else if ((user==0 && b==0) || (user==1 && b==1) || (user==2 && b==2)){
                System.out.println("Play Again..!");
            }
            else{
                win="You Loss";
                com+=1;
            }
            System.out.println(win);
            int ch;
            if (i==10){
                System.out.println("Game Over");
                System.out.println("Final Result");
                break;
            }
            else{
                ch=10-i;
                System.out.println(ch);
                System.out.printf("Your Remaining Play Chance Is %d",ch);
                System.out.println();
            }
            i++;
        }
        System.out.printf("Computer Win %d Times\nYou Win %d Times",com,users);
        if (com<users){
            System.out.println("\n\n*** You Are Winner ***");
        }else if (users<com){
            System.out.println("\n\n*** You Loss..! ***");
        }else{
            System.out.println("Play Again..!");
        }
    }
}
