import static java.lang.Math.random;

public class Yasir {
    public static void main(String[] args){
        System.out.println("Yasir Ali Take a time 45 mint to reset");
        System.out.println("hello Yasir  Wellcome");
        int x;
        int x1;
        x=5;
        x1=3;
        var a=x*x1;
        System.out.println(a);
        String a1="yasir";
        System.out.println(a1);
        String firstname="Yasir";
        String Lastname="Ali";
        String Full_name=firstname+ " "+Lastname;
        System.out.println(Full_name);
        int q,w,e;
        String c;
        q=1;
        w=10;
        e=20;
        c="'q'"+"'w'"+"'e'";
        var y=q+w+e;
        System.out.println(c);
        System.out.println(y);
        char s='D';
        System.out.println(s);
        char f=97,t=98,u=99;
        System.out.println(w);
        System.out.println(t);
        System.out.println(u);
        int p=12;
        float pp=p;
        System.out.println(pp);
        System.out.println(4%2);
        System.out.println(21%2);
        ++p;
        System.out.println(p);
        p+=10;
        System.out.println(p);
        System.out.println("It's Alright");
        System.out.println("its\"not\" Alright");
        System.out.println("Yasir \\ Ali");
        System.out.println(Math.sqrt(4));
        System.out.println(Math.abs(-3.4));
        System.out.println(random());
        System.out.println(Math.random());
        int ran=(int) (Math.random()*101);
        System.out.println(ran);
        System.out.println(10>=10);
        if (20>12){
            System.out.println("20 is greater than 12");

        }
        if (30==12){
            System.out.println("Sorry");

        }
        else{
            System.out.println(("Sorry"));

        }
        int time=20;
        if (time<18){
            System.out.println("Good Evening");

        }
        else{
            System.out.println("Good Morning");

        }
        if (time<=10){
            System.out.println("Good Day");

        }
        else if (time<22) {
            System.out.println("good Night");
        }else{
            System.out.println("Good");
        }
        String reults=(20<12) ?"GooD work":"bad";
        System.out.println(reults);

        int init=200;
        System.out.println((init<2)?"No":"its work ");

        int days= 1;
        switch (days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("LOok in your Month");

        }
        int i=1;
        while (i<=5){
            System.out.println(i);
            i++;
        }
        int n=0;
        do{
            System.out.println(n);
            n++;
        }while(n<=5);
        System.out.println();

        for (int ii = 0; ii<=8; ii++) {
            System.out.println(ii);
        }
        for (int aa=0;aa<=10;aa+=2){
            System.out.println(aa);
        }
        String[] ar={"yasir","ali","moon","cartoon"};
        for (String arr : ar){
            System.out.println(arr);
        }
        for (int aa=0;aa<=10;aa++){
            if (aa==4) {
                break;
            }
            System.out.println(aa);
        }
        int aaa=0;
        while (aaa<=10) {
            if (aaa<=7){
                aaa++;
                continue;
            }
            System.out.println(aaa);
            aaa++;

        }
        String[] ax={"Yasir","Ali","Nawab"};
        System.out.println(ax[0]);
        for (String ix:ax){
            System.out.println(ix);
        }
        ax[2]="Hello";
        System.out.println(ax[2]);
        System.out.println(ax.length);
        for (int ix=0;ix<ax.length;ix++){
            System.out.println(ax[ix]);
        }
        int mynum[][]={{11,3,5},{6,7,8}};
        System.out.println(mynum[0][0]);
        for (int ixx=0;ixx<mynum.length;ixx++){
            for (int ixx2=0;ixx2<mynum[ixx].length;ixx2++){
                System.out.println(mynum[ixx][ixx2]+"this");

            }

        }
        System.out.println(mynum[1].length);
        int[] nums={11,22,33};
        for (int azx=0;azx<nums.length;++azx){
            System.out.println(nums[azx]);
        }

     }
}
