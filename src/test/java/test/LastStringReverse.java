package test;

import java.util.Arrays;

public class LastStringReverse {

    public static void main(String[] args) {
        String str="Hi This is Soumya";
        String name[]=str.split(" ");
        for(int i=0;i<name.length;i++){
            if(i==name.length-1){
                for(int j=name[i].length()-1;j>=0;j--){
                    System.out.print(name[i].charAt(j));
                }
            }
            else
                System.out.print(name[i]+" ");
        }
    }

    }

