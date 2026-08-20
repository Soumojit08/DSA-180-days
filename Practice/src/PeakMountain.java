public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {50, 60, 70, 10, 20, 30, 40};
        int[] arr1 = {1,6,8,2,3};

        pivotIndex(arr);
        peak(arr1);
    }

    static void peak(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        if (n < 3) {
            return;
        }

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }
        }
        System.out.println("Peak elem : " + arr[ans] + " at index : " + ans);
    }

    static void pivotIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > arr[n - 1]) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        System.out.println("Pivot elem : " + arr[ans] + " at index : " + ans);
    }
}
