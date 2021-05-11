public class Aray {
//    public static void loop(int[] a){
//        for (int i=0;a.length>i;i++){
//            System.out.println(a[i]);
//        }
//    }
    public static void main(String[] args) {
        int[]  marks=new int[5];
        marks[0]=100;
        marks[1]=70;
        marks[2]=90;
        marks[3]=50;
        marks[4]=200;
        System.out.println(marks[0]);

        int [] num={1,2,3,4};


//        length of an array;
        System.out.println(num.length);


        float[] mark={1.5f,23.5f,20.5f};
        System.out.println(mark.length);
        System.out.println(mark[1]);

        String[] a={"Yasir","Ali","Nawab","Usama"};
        System.out.println(a.length);
        System.out.println(a[3]);
        System.out.println();
        System.out.println(num[3]);
//        for (int a=0;marks.length>a;a++){
//            System.out.println(a+" "+marks[a]);
//        }
//        loop(num);
//        loop(marks);
        for (int i=(a.length-1);i>=0;i--){
            System.out.println(a[i]);
        }

        for (int element:num){
            System.out.println(element);
        }















    }
}
