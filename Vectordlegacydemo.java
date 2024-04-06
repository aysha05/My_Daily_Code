import java.util.Vector;

class Vectordlegacydemo {

    public static void main(String[] args) {

        Vector v = new Vector();

        v.addElement("Deepak");
        v.add(1, "Rahul");
        v.add("Aishwarya");

        System.out.println(v);
    }
}