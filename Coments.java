import java.util.Scanner;
import java.util.Random;
public class Coments {
    public static void main(String[] args) {
//        int p1;
//        System.out.print("enter your choict 0 for rock ,1 paper and 2 for sisor");
//        Scanner sc=new Scanner(System.in);
//        p1=sc.nextInt();
//        Random R=new Random();
//        int p2;
//        p2=2;
//        p2=R.nextInt(p2);
//        switch(p1,p2){
//            case 0 1 -> System.out.print("computer won");
//            case 0 2 -> System.out.print("player won");
//            case 1 0 -> System.out.print("player won");
//            case 1 2 ->System.out.print("player won");
//            case 2 0 ->System.out.print("player won");
//            case 2 1 -> System.out.print("player won");
//            default -> System.out.print("its a draw");
//        }
        System.out.println("You Have 5 Chance To Play!");
        int i=1;
        while (i<=5){
            Random R=new Random();
            int upperBound=16;
            upperBound=R.nextInt(upperBound);
            System.out.println();
            String com = null;
            if (upperBound==0 || upperBound==1 || upperBound==2 || upperBound==3 ||upperBound==4 || upperBound==5){
                com="Sizr";
            }else if(upperBound ==6 || upperBound==7 || upperBound==8 || upperBound==9 || upperBound==10){
                com="Paper";
            }else if(upperBound==11 || upperBound==12 || upperBound==13 || upperBound==14 || upperBound==15){
                com="Rock";
            }else{
                System.out.println("Error Retry!");
            }

            Scanner S=new Scanner(System.in);
            System.out.println("Enter \"0\" for Sizr\nEnter \"1\" for Paper\nEnter \"2\" for Rock");
            int user=S.nextInt();
            String ch=null;
            if (user==0){
                ch="Sizr";
            }else if(user==1){
                ch="Paper";
            }else if(user ==2){
                ch="Rock";
            }else if (user>2){
                System.out.println("'\nYou Input Is Invalid' \nPlease Enter \"0,1,2\"");
            }if (user==0 || user==1 || user ==2){
                System.out.println("computer select :"+com);
                System.out.println("You select :"+ch);
                String computer=null;
                if (com=="Sizr" && ch=="Paper"){
                    computer="\nComputer Winner";
                }else if(com=="Paper" && ch=="Rock"){
                    computer="\nComputer Winner";
                }else if(com=="Rock" && ch=="Sizr"){
                    computer="\nComputer Winner";
                }else if((com=="Rock" && ch=="Rock") || (com=="Paper" && ch=="Paper") || (com=="Sizr" && ch=="Sizr")){
                    computer="\nPlay Again";
                }else{
                    computer="\n\nYou Win";
                }
                System.out.println(computer+"\n");
                i+=1;
            }
        }

    }
}
