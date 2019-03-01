public class Distance1 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int diff = Math.max(n1, n2) - Math.min(n1, n2);
        System.out.println(diff);
    }
}