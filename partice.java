public class partice{
    public static void main(String[]args){
        String[] lit={"Cartoon","Yasir","Ali"};
        System.out.println(lit[0]);
        for (String i: lit){
            System.out.println(i);
        }

        int[] num={1,22,34,45};
        for (int q=0 ; q<num.length ; q++){
            System.out.println(num[q]);
        }
        int[][] numlist={{55,36,23,21},{12,32,23}};
        for (int x=0 ; x<numlist.length ; x++){
            for (int y=0 ; y<numlist[x].length ; y++){
                System.out.println(numlist[x][y]+"a");
            }
        }

        String[] Str={"Yasir","Ali"};
        for (String i:Str){
            System.out.println(i);
        }
    }
}
