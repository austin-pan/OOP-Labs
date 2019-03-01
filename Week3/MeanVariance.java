public class MeanVariance {
    public static void main(String[] args) {
        double sum = 0;
        for(int i=0; i<args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }
        double mean = sum / args.length;
        
        double summation = 0;
        for(int i=0; i<args.length; i++) {
            summation += Math.pow((Double.parseDouble(args[i]) - mean),2);
        }
        System.out.println(mean);
        System.out.println((double) summation / args.length);
    }
}