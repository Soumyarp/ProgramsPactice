package GeneralPrograms;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Scanner;

/**
 * Created by Soumya
 */
public class SandeshGFList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter my gf name :");
        String str= sc.nextLine();
        String s = "Khalifa";
        String str1=str+s+" ";
        String s1= "sandesh";
        while(true){
            if(str1.contains(s)){
                System.out.println(str1+ " is Sandesh's Girlfriend" );
                System.out.println(s1+str);
                break;
            }
        }
    }
}
