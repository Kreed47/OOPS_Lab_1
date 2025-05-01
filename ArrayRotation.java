import java.util.Arrays;
import java.util.HashSet;

public class ArrayRotation {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = set.stream().sorted().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 5, 3, 2, 7, 2, 8, 7, 5};

        System.out.println("Original array: " + Arrays.toString(arr));
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
    }
}

