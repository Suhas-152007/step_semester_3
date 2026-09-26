public class FindMinimumInRotatedArray {

    static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int middle = left + (right - left) / 2;

            if (nums[middle] > nums[right]) {
                // Minimum is on the right side
                left = middle + 1;
            } else {
                // Minimum is at middle or on the left
                right = middle;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 1, 2, 3};

        System.out.println(findMin(nums));
    }
}