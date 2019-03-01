public class ArrayOps {
    public static double findMax(double[] data) {
        double max = data[0];
        for(int i=1; i<data.length; i++)
            if(data[i] > max)
                max = data[i];
        return max;
    }

    public static double[] normalise(double[] data) {
        double[] copy = new double[data.length];
        for(int i=0; i<data.length; i++)
            copy[i] = data[i];
        double sum = 0;
        for(int i=0; i<copy.length; i++)
            sum += data[i];
        for(int i=0; i<copy.length; i++)
            copy[i] /= sum;
        return copy;
    }

    public static void normaliseInPlace(double[] data) {
        double sum = 0;
        for(int i=0; i<data.length; i++)
            sum += data[i];
        for(int i=0; i<data.length; i++)
            data[i] /= sum;
    }

    public static double[] reverse(double[] data) {
        double[] copy = new double[data.length];
        for(int i=0; i<copy.length; i++)
            copy[i] = data[i];
        for(int i=0; i<copy.length/2; i++) {
            double temp = copy[i];
            copy[i] = copy[copy.length-1-i];
            copy[copy.length-1-i] = temp;
        }
        return copy;
    }

    public static void reverseInPlace(double[] data) {
        for(int i=0; i<data.length/2; i++) {
            double temp = data[i];
            data[i] = data[data.length-1-i];
            data[data.length-1-i] = temp;
        }
    }

    public static void swap(double[] data1, double[] data2) {
        double[] temp = new double[data1.length];
        for(int i=0; i<data1.length; i++)
            temp[i] = data1[i];
        for(int i=0; i<data1.length; i++)
            data1[i] = data2[i];
        for(int i=0; i<data2.length; i++)
            data2[i] = temp[i];
    }
    
    public static void main(String[] args) {
        double[] test = {1,2,3,4,5,6};
        double[] test2 = {2,3,4,5,6,7};
        swap(test,test2);
        for(int i=0; i<test.length; i++)
            System.out.print(test[i] + " ");
        System.out.println();
        for(int i=0; i<test2.length; i++)
            System.out.print(test2[i] + " ");
        System.out.println();
    }
}