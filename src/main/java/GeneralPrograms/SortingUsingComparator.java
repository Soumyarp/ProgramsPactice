package GeneralPrograms;

import java.util.*;

public class SortingUsingComparator {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(735);
        l.add(632);
        l.add(464);
        l.add(889);
        l.add(678);
    //    Collections.sort(l);  //used for sorting the elements
     //   Collections.reverse(l); // used for reversing the elements
        Comparator<Integer> cmp = new ComImpl();
        Collections.sort(l,cmp);
       l.forEach(System.out::println);
      /*  for(int i:l){
            System.out.println(i);
        }
*/
   /*   Iterator itr=l.iterator();
      while(itr.hasNext()){
          itr.next();
          System.out.println(itr);
      }*/

    }
}

class ComImpl implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1%100>o2%100)
            return 1;
        return  -1;
    }
}