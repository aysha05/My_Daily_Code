import java.util.HashMap;
import java.util.Map;

class TestMap {
    public static void main(String[] args) {

        Map map = new HashMap();

        // map.put(101, "Aish");
        // map.put(102, "Aksah");
        // map.put(103, "kale");

        // System.out.println(map);

        // map.clear();//{}

        // System.out.println(map.containsKey(108));//=>false

        // System.out.println(map.containsValue("Aish"));//=>

        // System.out.println(map.get(102));//aksha

        // System.out.println(map.remove(102));//{101=aish 103=kale}

        // System.out.println(map.replace(101, "Kailas"));//{101=kailas 102=aksh
        // 103=kale}

        // System.out.print(map.size());// =>3

        map.put(106, "Aish");
        map.put(103, "Aksah");
        map.put(108, "kale");
        map.put(102, "yadav");

        map.put(null, null);
        map.put(null, "Aksah"); // we cannot store mult null values in key
        // but can store mul null
        // values in vaalues

        System.out.println(map);// {101=aish 102=yadav 103=kale}
    }
}
