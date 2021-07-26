package Arrays;

public class PairOfNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int sum = 9;
        int min = 0;
        int max = arr.length-1;
        while (min < max) {
            if (arr[min] + arr[max] == sum) {
                System.out.println("the given pair is: " + "[" + arr[min] + "," + arr[max] + "]");
                min++;
                max--;

            }
            else if(arr[min]+arr[max]<sum){
                min++;
            }
            else if(arr[min]+arr[max]>sum){
                max--;
            }
            else {
                System.out.println("No pair elements found");

            }

        }
    }
}
