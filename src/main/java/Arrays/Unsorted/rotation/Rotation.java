package Arrays.Unsorted.rotation;

public class Rotation {
  public static void rotate(int a[],int k){
        int n = a.length;
        for(int i=0;i<n;i++){
          System.out.println(a[(i+k)%n]);   //  Left Rotation
     //     System.out.println(a[(i+n-k)%n]);   //  Right Rotation
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=arr.length-1;
        rotate(arr,k);
    }
}
