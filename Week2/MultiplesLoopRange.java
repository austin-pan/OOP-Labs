public class MultiplesLoopRange {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        int mult = Integer.parseInt(args[2]);
        if(start < end) {
            for(int i=start; i<=end; i++) {
                if(i%mult == 0)
                    System.out.print(i + " ");
            }
        }
        else {
            for(int i=start; i>=end; i--) {
                if(i%mult == 0)
                    System.out.print(i + " ");
            }
        }
        //prints space at the end might not work with JUnit
        System.out.println();
    }
}