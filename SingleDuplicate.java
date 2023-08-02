import java.util.HashSet;

public class SingleDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 6};

        int duplicate = findSingleDuplicate(nums);

        if (duplicate != -1) {
            System.out.println("The single duplicate is: " + duplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }

    public static int findSingleDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                return num;
            }
            seenNumbers.add(num);
        }

        return -1;
    }
}
