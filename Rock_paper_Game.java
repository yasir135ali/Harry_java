import java.util.Scanner;
import java.util.Random;
public class Rock_paper_Game {
    public static void main(String[] args) {
        Random R=new Random();
        int upperBound=16;
        upperBound=R.nextInt(upperBound);
        System.out.println(upperBound);
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
        }else{
            System.out.println("You Input Is Invalid \nPlease Enter \"0,1,2\"");
        }
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
        System.out.println(computer);
    }
}
