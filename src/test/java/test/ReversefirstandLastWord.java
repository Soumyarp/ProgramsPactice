package test;

public class ReversefirstandLastWord {

    public static void main(String[] args) {
        String str = "My name is Soumya";
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            //     if(i!=0 && i!=arr.length-1){
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");

        }
    }
}
