package Arrays;

public class InsertArrays {
    int count;

    public static void main(String[] args) {
        InsertArrays insertArrays = new InsertArrays();
        int a[] = new int[5];

       /* a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;*/
        /*Insert values using for loop*/
        for (int j = 0; j < a.length; j++) {
            insertArrays.insert(a, j+1);
        }
        insertArrays.print(a);
        insertArrays.insertAtStartPosition(a,10);
        insertArrays.print(a);
    }


    void insert(int a[], int val) {
        a[count++] = val;
    }

    void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    void insertAtStartPosition(int a[], int val){

        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=val;
    }
}