package test;

public class Maxno {

    public static int maxconsictiveones(int arr[],int size){
        int count =0;
        int res=0;
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                count= 0;
            }
            else {
                count++;
                res=Math.max(res,count);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,1,1,1,1,0,1,1,0,0};
        int length= arr.length;
        System.out.println(maxconsictiveones(arr,length));
    }
}
