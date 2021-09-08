import java.util.Arrays;
public class Main3 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int first = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = first;
        System.out.println(nums[0] + nums[nums.length/2]);
        System.out.println(Arrays.toString(nums));

    }
}
