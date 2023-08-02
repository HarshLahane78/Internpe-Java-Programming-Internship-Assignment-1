import java.util.HashMap;

public class NonUniqueDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 6, 4};

        int duplicate = findNonUniqueDuplicate(nums);

        if (duplicate != -1) {
            System.out.println("The non-unique duplicate is: " + duplicate);
        } else {
            System.out.println("No non-unique duplicates found.");
        }
    }

    public static int findNonUniqueDuplicate(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (frequencyMap.get(num) > 1) {
                return num;
            }
        }

        return -1;
    }
}
