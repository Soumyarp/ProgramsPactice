package ProgrammingTutorials.UnsortedArray;

public class ThirdHighest {
    public static void main(String[] args) {
        int arr[]={1,9,3,43,4,7,55};
        int first= arr[0];
        int second = Integer.MIN_VALUE;
        int third= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]< first && arr[i]>second){
                second=arr[i];
            }
            else if(arr[i]<second && arr[i]>third)
                third=arr[i];
        }
        System.out.println(third);

    }
}
