public class NoTriples {
    public static boolean noTriples(int[] nums) {
        for(int i=0; i<nums.length-2; i++) {
            if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] test = {1, 1, 2, 2};
        System.out.println(noTriples(test));
    }
}