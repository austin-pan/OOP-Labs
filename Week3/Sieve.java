public class Sieve {
    public static void main(String[] args) {
        int[] nums = new int[19];
        for(int i=0; i<nums.length; i++) {
            nums[i] = i+2;
        }
        
        for(int i=0; i<nums.length; i++) {
            int curr = nums[i];
            if(curr > 1) {
                for(int j=i+1; j<nums.length; j++) {
                    if(nums[j] % curr == 0) {
                        nums[j] = 0;
                    }
                }
            }
        }
        
        for(int i=0; i<nums.length; i++)
            if(nums[i] > 1)
                System.out.print(nums[i] + " "); //adds space afterwards
        System.out.println();
    }
}