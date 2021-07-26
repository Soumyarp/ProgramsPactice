package FAQ;

public class LargestOf3numbers {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        /*approach 1*/
       /*if(a>b&&a>c){
            System.out.println("largest of three numbers is "+a);
        }
       else if(b>a&&b>c){
            System.out.println("largest of three numbers is "+b);
        }
        else
            System.out.println("largest of three numbers is "+c);
*/
       int largest =c> (a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest);
    }
}
