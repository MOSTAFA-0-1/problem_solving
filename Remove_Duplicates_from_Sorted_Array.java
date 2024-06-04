import java.util.LinkedList;
import java.util.Queue;

public class Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] arr = new int[] { 0, 1 };
        int[] expectedNums = new int[] { 0, 1 };
        // System.out.println(sl.removeDuplicates(arr));
        // System.out.println(Arrays.toString(arr));
        int k = sl.removeDuplicates(arr);
        System.out.println(k);
        assert k == expectedNums.length;
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            assert arr[i] == expectedNums[i];
            System.out.println(arr[i] == expectedNums[i]);
        }
    }
}

class Solution {
    int i = 0;
    int duplicatesN = 0;
    Queue<Integer> listOfIndexes = new LinkedList<Integer>();

    public int removeDuplicates(int[] nums) {
        for (i = 0; i < nums.length - 1; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                listOfIndexes.add(i + 1);
                duplicatesN++;
            } else if (listOfIndexes.size() != 0) {

                nums[listOfIndexes.remove()] = nums[i + 1];
                listOfIndexes.add(i + 1);

            }
        }

        return nums.length - duplicatesN;
    }
}
