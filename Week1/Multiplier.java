public class Multiplier {
    public static void main(String[] args) {
        int prod = 1;
        for(int i=0; i<args.length; i++) {
            prod *= Integer.parseInt(args[i]);
        }
        System.out.print(args[0]);
        for(int i=1; i<args.length; i++) {
            System.out.print(" * " + args[i]);
        }
        System.out.println(" = " + prod);
    }
}