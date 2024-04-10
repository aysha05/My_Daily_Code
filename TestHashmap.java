import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

class TestHashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap();

        hm.put(101, "KAle");
        hm.put(102, "Aish");
        hm.put(103, "Rahul");
        hm.put(104, "Kamal");

        System.out.println(hm);// {101=kale, 102=aish, 103=rahul, 104=kamal}

        for (Map.Entry me : hm.entrySet()) {
            System.out.println(me.getKey() + " -> " + me.getValue());
        }

        // ************output**********
        // 101 -> KAle
        // 102 -> Aish
        // 103 -> Rahul
        // 104 -> Kamal
        // Set set = hm.entrySet();
        // System.out.println(set);//[101=kale, 102=aish, 103=rahul,104=kamal]

        // Iterator itr = set.iterator();

        // {
        // while (itr.hasNext()) {

        // System.out.println(itr.next());
        // 101=kale
        // 102=aish
        // 103=rahul
        // 104=kamal

        // }
        // Map.Entry entry = (Map.Entry) itr.next();

        // System.out.println(entry.getKey() + " -> " + entry.getValue());

        // {101=KAle, 102=Aish, 103=Rahul, 104=Kamal}
        // 101 -> KAle
        // 102 -> Aish
        // 103 -> Rahul
        // 104 -> Kamal

        // }
        // }
    }

}
