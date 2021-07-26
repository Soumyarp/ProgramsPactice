package Arrays;

public class MinandMaxValue {
    public static void main(String[] args) {
        int arr[]= {3,7,9,1,6,10,2};
        int min =arr[0];
        int max =arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]<min) {
               min = arr[i];
           }
           if(arr[i]>max){
               max=arr[i];
           }
        }
        System.out.println("Minimum value of an array is "+min +" && "+"Max value of an array is "+max);
    }
}
