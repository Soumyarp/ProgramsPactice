package ProgrammingTutorials.UnsortedArray;

public class SecondHighest {
    public static void main(String[] args) {
        int arr[]={1,9,3,55,4,7,55};
        int highest= Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>highest){
                secondHighest=highest;
                highest=arr[i];
            }
            if(arr[i]<highest && arr[i]>secondHighest){
                secondHighest=arr[i];
            }
        }
        System.out.println(secondHighest);
    }
}
