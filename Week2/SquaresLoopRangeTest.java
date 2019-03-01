public class SquaresLoopRangeTest {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        if(start > end) {
            System.out.println("Start-limit greater than stop-limit");
        }
        else {
            for(int i=start; i<end; i++) {
                System.out.print(i*i + " ");
            }
            System.out.println(end*end);
        }
    }
}