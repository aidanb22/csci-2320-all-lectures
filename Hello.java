import java.util.Arrays;

public class Hello {


    public static void main(String[] Args) {
        int[] numms = new int[3];

        returnMultiple(20);

        int[] a1 = {1,1,2,3};
        int[] a2 = {1,2,3};
        System.out.println(isRepeating(a1));
        System.out.println(isRepeating(a2));
    }


    static int returnMultiple(int n){
        int sum = 0;
        for(int i = 0; i < 20; i ++){
            if(i % 5 == 0 || i % 7 == 0){
                System.out.println(i);
            }
        }
        return -1;
    }
    static boolean isRepeating(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
         return false;
    }
}



