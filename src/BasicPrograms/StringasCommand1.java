package BasicPrograms;
public class StringasCommand1{
    public static void main(String[] args){
        if (args.length==1) {
            String name=args[0];
            System.out.println("Welcome "+name);
        }
    }
}