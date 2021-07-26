package Arrays;

public class CommonElements {
   /* public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int b[]={10,11,2,12,13,14};
        int c[]={20,21,25,2,33,64};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                for (int k=0;k<c.length;k++){
                    if(a[i]==b[j] &&b[j]==c[k]){
                        System.out.println(a[i]);
                    }
                }
            }

        }
    }*/

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,12};
        int b[]={2,10,11,12,13,14};
        int c[]={2,12,20,21,25,33,64};
        commonelements(a,b,c);
    }

    private static void commonelements(int[] a, int[] b, int[] c) {
        int x=0,y=0,z=0;
        while (x<a.length && y<b.length && z<c.length){
            if(a[x]==b[y] && b[y]==c[z]){
                System.out.println("Commen Element is "+a[x]);
                x++;
                y++;
                z++;
            }
            else if(a[x]<b[y]){
                x++;
            }
            else if(b[y]<c[z]){
                y++;
            }
            else
                z++;

        }
    }

}
