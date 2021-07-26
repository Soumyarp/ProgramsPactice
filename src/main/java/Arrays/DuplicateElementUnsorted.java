package Arrays;

public class DuplicateElementUnsorted {

    public static void main(String[] args) {
        int arr[]={2,1,4,3,5,2,3,5,6,7};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
