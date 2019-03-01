public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
        for(int i = 0; i < Math.min(4, nums.length); i++) {
            if(nums[i] == 9)
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int N = args.length;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(arrayFront9(nums));
    }
}