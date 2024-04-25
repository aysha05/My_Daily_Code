class Static_var_Demo1 {
    int empid;
    String name;
    static String company = "Smart Programming";

    Static_var_Demo1(int empid, String name) {
        this.empid = empid;
        this.name = name;

    }

    void display() {
        System.out.println(empid + " " + name + " " + company);
    }

    public static void main(String[] args) {
        Static_var_Demo1 s = new Static_var_Demo1(101, "Aishwarya");
        s.display();
        Static_var_Demo1 s1 = new Static_var_Demo1(102, "KAle");
        s1.display();

    }
}