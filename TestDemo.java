import java.util.TreeSet;

class TestDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(30);
        ts.add(10);
        ts.add(40);
        ts.add(20);
        ts.add(100);

        // ts.add("Ganeshrao");
        // ts.add("Aishwarya");
        // ts.add("raju");

        // System.out.println(ts);

        // ts.clear();
        ts.remove(20);
        System.out.println(ts);

    }
}