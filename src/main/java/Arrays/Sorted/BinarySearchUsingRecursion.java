package Arrays.Sorted;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int num=30;
        int start=0;
        int end=arr.length-1;
        searchusingRecursion(arr,start,end,num);

    }
    public static void searchusingRecursion(int arr[],int start,int end,int searchnum){
        if(start>end)
            return;
        int mid=(start+end)/2;
        if(arr[mid]==searchnum){
            System.out.println("searched num found in index "+mid);
            return;
        }

        else if(arr[mid]>searchnum){
            searchusingRecursion(arr,start,mid-1,searchnum);
        }
        else if(arr[mid]<searchnum){
            searchusingRecursion(arr,mid+1,end,searchnum);
        }
    }
}
