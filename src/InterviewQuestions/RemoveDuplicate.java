package InterviewQuestions;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        int newLength = remove(arr);

        System.out.println("After removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int remove(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0;  // pointer for the last unique element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;  // length of array without duplicates
    }
}
