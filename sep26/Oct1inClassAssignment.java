package sep26;

import java.util.HashMap;
import java.util.Map;

public class Oct1inClassAssignment {


//        public int[] twoSum(int[] nums, int target){
//
//            for(int i = 0; i < nums.length - 1; i++){
//                for(int j = 1; j < nums.length; j++){
//                    if(nums[i] + nums[j] == target){
//                        return new int[]{i,j};
//                    }
//
//                }
//            }
//            return nums;
//        }

        public int[] twoSum(int[] nums, int target){

            Map<Integer, Integer> numMap = new HashMap<>();

            for(int i = 0; i <nums.length; i++){
                int diff = target - nums[i];

                if(numMap.containsKey(diff)){
                    return new int[]{numMap.get(diff),i};

                }
                numMap.put(nums[i],i);
            }
            return new int[0];
        }


//    public static void findSymPairs(int[][] arr, int row){
//
//
//        for(int i = 0; i < row; i++){
//            for(int j = 1; j < row; j++){
//                if(arr[i][0] == arr[j][1]){
//                    if(arr[i][1] == arr[j][0]){
//
//                    }
//
//                }
//            }
//
//
//    }
//
//
//
//}


        public static void findSymPairs(int[][] arr, int row){
            HashMap<Integer, Integer> hm = new HashMap<>();

            for(int i = 0; i < arr.length; i++){
                int first = arr[i][0]; //first pair
                int sec = arr[i][1];  //second pair

                Integer val = hm.get(sec);

                if(val != null && val == first)
                    System.out.println(sec + " " + first);

                else
                    hm.put(first,sec);

            }
        }
    }
