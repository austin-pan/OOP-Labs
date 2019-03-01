public class NbyN {
    public static int[][] nbyn(int n) {
        int[][] mat = new int[n][n];
        for(int r=0; r<n; r++) {
            for(int c=0; c<n; c++) {
                mat[r][c] = 0;
                if(r == c) {
                    mat[r][c] = r;
                }
            }
        }
        return mat;
    }
    
    public static void main(String[] args) {
        int[][] test = nbyn(10);
        for(int r=0; r<test.length; r++) {
            for(int c=0; c<test[r].length; c++)
                System.out.print(test[r][c]);
            System.out.println();
        }
    }
}