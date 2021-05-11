public class String_PS {
    public static void main(String[]args){
        String Name="My Name Is  Yasir ALi";
        Name=Name.toLowerCase();
        String Name_lower=Name.toLowerCase();
        System.out.println(Name);
        System.out.println(Name_lower);

        String name_replace=Name.replace(" ","_");
        System.out.println(name_replace);

        String target="Dear <|name|>, Trans a lots";
        String target_replace=target.replace("<|name|>","Yasir");
        System.out.println(target_replace);
    }
}
