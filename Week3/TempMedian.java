import java.util.Arrays;

public class TempMedian {
    public static void main(String[] args) {
        int[] temps = new int[args.length];
        temps[0] = Integer.parseInt(args[0]);
        for(int i=1; i<args.length; i++) {
            if(args[i].equals("-")) {
                temps[i] = temps[i-1] - 1;
            }
            else if(args[i].equals("+")) {
                temps[i] = temps[i-1] + 1;
            }
            else {
                temps[i] = temps[i-1];
            }
        }
        for(int i=0; i<temps.length; i++)
            System.out.print(temps[i] + " ");
        System.out.println();
        Arrays.sort(temps);
        for(int i=0; i<temps.length; i++)
            System.out.print(temps[i] + " ");
        System.out.println();
        double median = 0;
        if(temps.length%2 == 1)
            median = temps[temps.length/2];
        else
            median = (temps[temps.length/2] + temps[temps.length/2 + 1])/2;
        System.out.println(median);
    }
}