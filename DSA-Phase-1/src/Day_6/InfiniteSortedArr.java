package Day_6;

public class InfiniteSortedArr {
    public static void main(String[] args) {
         int[] arr = {2,2,4,5,7,9,25,56,88,94};
         int[] range = findRange(arr, 25);
        System.out.println(range[0] + " , " + range[1]);
        binarySearch(arr, 25, range[0], range[1]);
    }

    public static int[] findRange(int[] arr ,int target){
        int[] range = new int[2];
        int start = 0;
        int end=1;

        while (arr[end]<target){
            start=end;
            end=2*end;
        }
        range[0] = start;
        range[1] = end;

        return range;
    }

    public static void binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid =  start + (end-start)/2;

            if(arr[mid]==target){
                System.out.println("Elem found at index : " + mid);
                break;
            } else if(arr[mid]<target){
                start=mid+1;
            } else {
                end=start-1;
            }
        }
    }
}
