public class ArithmeticSeries {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int total = 0;
        int c = 1;
        while(c <= num) {
            total += c;
            c++;
        }
        System.out.println(total);
    }
}