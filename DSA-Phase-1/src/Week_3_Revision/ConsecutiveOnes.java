package Week_3_Revision;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,0,1};

        findStreak(arr);
    }

    public static void findStreak(int[] arr){
        int count = 0;
        int maxStreak = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                count++;
            } else if (arr[i]==0) {
                count=0;
            }

            maxStreak = Math.max(count,maxStreak);
        }

        System.out.println("Maximum Occurence of 1 : " + maxStreak);
    }
}
