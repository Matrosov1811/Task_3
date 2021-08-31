public class main3 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int last = nums[nums.length - 1];
        int middle = nums[nums.length / 2];
        int a = last;
        last = nums[0];
        nums[0] = a;
        System.out.println(nums[0] + middle);

    }
}
