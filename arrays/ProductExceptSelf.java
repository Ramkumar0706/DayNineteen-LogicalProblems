package arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        for (int i = 0; i < output.length; i++) {
        	output[i]=1;
			for (int j = 0; j < output.length; j++) {
				if(nums[i]!=nums[j]) {
					output[i]*=nums[j];
				}
			}
		}

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        
        System.out.print("Output array: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
