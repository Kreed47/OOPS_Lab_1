public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = 0;
        int secondLargest = 0;
        boolean found = false;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
                found = true;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
                found = true;
            }
        }

        return found && secondLargest != 0 ? secondLargest : -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 32, 22, 54, 39, 53, 19};
        System.out.println("Second Largest: " + findSecondLargest(arr1));

    }
}

