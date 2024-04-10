import java.util.TreeMap;

class TestTreeMap {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();

        map.put(106, "Aishwarya");
        map.put(102, "Kale");
        map.put(104, "panha");
        map.put(101, "Ashish");

        // System.out.println(map);

        // map.put("Kale", 101);
        // map.put("Aishwarya", 102);
        // map.put("panha", 108);
        // map.put("Aishwarya", 102);
        // map.put("dishish", 104);

        // System.out.println(map);

        // System.out.println(map.ceilingEntry(103));
        // System.out.println(map);

        // System.out.println(map.ceilingKey(103));

        // map.clear();
        // System.out.println(map);

        // System.out.println(map.containsKey(104));

        // System.out.println(map.firstEntry());

        // System.out.println(map.lastEntry());

        // System.out.println(map.floorEntry(104));//104="panha"

        // System.out.println(map.floorEntry(107));// 106="Aishwarya"

        // System.out.println(map.get(104));// panha

        // System.out.println(map.get(107));// null

        // System.out.println(map.headMap(104));//101=ashish 102=kale

        // System.out.println(map.higherEntry(108));//null
        // System.out.println(map.higherKey(104));//106

        // System.out.println(map.keySet());//[101, 102, 104, 106]

        // System.out.println(map.pollFirstEntry());// 101="ashsi"

        ///// System.out.println(map);//{102=kale, 104=pamha, 106=aishwarya}

        // System.out.println(map.pollLastEntry());//106=aishwarya

        // System.out.println(map);{101=ashish, 102=kale, 104=panha}

        // map.remove(102);//{101=ahish 104=panha 106=aishwarya}

        // map.replace(102, "AAA");//{101=ashish 102=AAA, 104=panha 106=aishwarya}

        // System.out.println(map.size());//4

        // System.out.println(map.subMap(101, 106));//{101=Ashish, 102=kale, 104=panha}
    }
}