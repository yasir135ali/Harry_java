public class Method {
    static void mymethod(){
        System.out.println("Ali Ali");
    }
    static int add(int a,int b) {
        int z;
        z = a + b;
        return z;
    }
    static int logic(int a,int b){
        int c;

        if (a>b){
            c=a+b;
        }
        else{
            c=a*b;

        }
        return c;
    }
    int name(int a,int b){
        int z;
        z=a/b;
        return z;
    }

    public static void main(String[]args){
        System.out.println("Yasir ALi Welcome");
        int[] num={1,22,34,45};
        System.out.println(num[0]);
        for (int a=0 ; a<num.length ; a++){
            System.out.println(num[a]);
        }
        mymethod();
        int a ,b;
        a=30;
        b=5;
        int c=add(a,b);
        System.out.println(c);
        System.out.println(logic(a,b));
        System.out.println();
        int result=sum(10);
        System.out.println(result);
        System.out.println();
        //an other method to call a method
        Method obj=new Method();
        System.out.println(obj.name(a,b));

    }
    static int sum(int k){
        if (k > 0) {
            return k +sum(k-1);
        } else {
            return 0;
        }
    }
}
