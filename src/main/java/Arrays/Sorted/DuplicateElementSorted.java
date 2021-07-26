package Arrays.Sorted;

public class DuplicateElementSorted {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4,4,5,5,5,6,7,7,7,7,8};
        int len =arr.length;
        int j=0;
  //      int temp[]=new int[arr.length]; //Note instead using another array we can do using the same arr to get the duplicate element
        for(int i=0;i<len-1;i++){
            if(arr[i] !=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[len-1];
        for (int k=0;k<j;k++){
            System.out.println(arr[k]);
        }

    }

}
