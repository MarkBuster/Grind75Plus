import java.util.HashMap;

/**
 * This method finds the index of which two numbers add to the target number and returns
 * an array of the two indexes.
 * By using a hashmap, the time complexity acheived in O(N).
 */
public class TwoSum{

    int targetNum;
    int[] array;


    public TwoSum(int randomNum1, int randomNum2, int randomNum3, int randomNum4, int randomNum5,
                    int randomNum6, int targetNum){
                        
        this.targetNum  = targetNum;
        array = new int[]{randomNum1, randomNum2, randomNum3, randomNum4, randomNum5, randomNum6};
    }


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return null;  // or throw exception - no solution found
    }

}