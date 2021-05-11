public class Break_and_continous {
    public static void main(String[]args){
//        for (int i=1;i<=5;i++){
////            System.out.println(i);
//            System.out.println(i+": java is Great");
//            if (i==2){
//                System.out.println("Loop Is Ending");
//                break;
//            }
//        }
//        int i=0;
//        while(i<=5){
//            System.out.println(i);
//            System.out.println("java in while");
//            if (i==3){
//                System.out.println("While Stop!");
//                break;
//            }
//            i++;
//        }
//        i=0;
//        System.out.println("Do While Loop");
//        do {
//            System.out.println(i);
//            System.out.println("Do While Loop");
//            if (i==4){
//                System.out.println("Do While Stop!");
//                break;
//            }
//            i++;
//        }while(i<=50);

//        Continue Statement
        for (int a=1;a<=50;a++){
            if (a==2){
                System.out.println("Ignore");
                continue;
            }
            System.out.println(a);
            System.out.println("Continue Statement");
        }
    }
}
