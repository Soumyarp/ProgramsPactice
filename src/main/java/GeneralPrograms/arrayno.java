package GeneralPrograms;

public class arrayno {
    public static void main(String[] args) {
        int count=0;
        int arr[]={4,2,5,8,7};
        int no=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>no){
          //      System.out.println(arr[i]);
                count++;
            }

        }
        System.out.println(count);

    }
}
