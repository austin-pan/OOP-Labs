public class ImQuadraticSolver {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        if(a == 0) {
            System.out.println("A = 0. Cannot solve equation");
        }
        else {
            double disc = b*b - 4*a*c;
            if(disc < 0) {
                double ans1 = -b/(2*a);
                double ans2 = -b/(2*a);
                double coef = (Math.sqrt(Math.abs(disc))/(2*a));
                System.out.println(ans1 + " + "+coef+"i" + "\n" + ans2 + " - "+coef+"i");
            }
            else {
                double ans1 = (-b + Math.sqrt(disc)) / (2 * a);
                double ans2 = (-b - Math.sqrt(disc)) / (2 * a);
                System.out.println(ans1 + "\n" + ans2);
            }
        }
    }
}