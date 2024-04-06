import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo1 {

    public static void main(String[] args) 
    {

        ArrayList al1 = new ArrayList();

        al1.add(100);
        al1.add(800);
        al1.add(400);
        al1.add(null);
        al1.add(null);

        // System.out.println(al1);

        // System.out.println(al1.indexOf(800));

        Iterator itr = al1.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

        }
    }
}