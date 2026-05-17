public class merge{

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before Sorting:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Merge Sorting:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, right, mid);
        }
    }

    public static void merge(int[] arr, int left, int right, int mid) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftarr[] = new int[n1];
        int rightarr[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftarr[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rightarr[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (leftarr[i] <= rightarr[j]) {
                arr[k] = leftarr[i];
                i++;
            } else {
                arr[k] = rightarr[j];
                j++;
            }

            k++;
        }

        // remaining left elements
        while (i < n1) {
            arr[k] = leftarr[i];
            i++;
            k++;
        }

        // remaining right elements
        while (j < n2) {
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }
}