public class ArrayRotate {
    public static void main(String[] args) {
        int[] copy = new int[args.length];
        copy[args.length-1] = Integer.parseInt(args[0]);
        for(int i=0; i<args.length - 1; i++) {
            copy[i] = Integer.parseInt(args[i+1]);
        }
        
        for(int i=0; i<copy.length; i++) {
            System.out.print(copy[i] + " "); //adds space to the end
        }
        System.out.println();
    }
}