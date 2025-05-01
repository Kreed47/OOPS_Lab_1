import java.util.ArrayList;

public class RemoveDuplicates {
    public static int[] removeDuplicatesWithList(int[] data) {
        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for (int value : data) {
            if (!uniqueElements.contains(value)) {
                uniqueElements.add(value);
            }
        }

        // Convert ArrayList back to an array
        int[] result = new int[uniqueElements.size()];
        for (int i = 0; i < uniqueElements.size(); i++) {
            result[i] = uniqueElements.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 5, 3, 2, 7, 2, 8, 7, 5};
        int[] result = removeDuplicatesWithList(arr);
        System.out.println(java.util.Arrays.toString(result));
    }
}

