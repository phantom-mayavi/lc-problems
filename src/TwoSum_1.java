import java.util.HashMap;
import java.util.Map;

class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indexMap.get(diff) != null) {
                return new int[] {indexMap.get(diff), i};
            }
            indexMap.put(nums[i], i);

        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> elementsPositions = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (elementsPositions.containsKey(target - nums[i])) {
                return new int[]{elementsPositions.get(target - nums[i]), i};
            } else {
                elementsPositions.put(nums[i], i);
            }
        }

        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] position = twoSum(new int[]{7,11,2,15}, 9);
        System.out.println(position[0] + " " + position[1]);
    }
}