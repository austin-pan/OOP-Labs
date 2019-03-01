public class Mode {
    public static void main(String[] args) {
        int[] count = new int[10];
        for(int i=0; i<args.length; i++) {
            int curr = Integer.parseInt(args[i]);
            count[curr]++;
        }
        
        int maxTally = 0;
        int mode = 0;
        for(int i=1; i<count.length; i++) {
            if(count[i] > maxTally) {
                maxTally = count[i];
                mode = i;
            }
        }
        
        for(int i=0; i<count.length; i++) {
            System.out.print("["+i+"s: "+count[i]+"] ");
            for(int j=0; j<count[i]; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        System.out.println("Mode: "+mode);
    }
}