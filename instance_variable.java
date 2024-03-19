class instance_variable {
    int a = 0; // instance variable
    static int b = 40; /// static variable

    public static void main(String[] args) {

        instance_variable sc = new instance_variable(); // object created by the nonstatic method call

        sc.Disp(); // nonstatic method call.

        instance_variable.show(); // static method call

    }

    static void show() // static method name
    {
        System.out.println("Show " + b);// static block
    }

    void Disp() // nonstatic method name
    {
        System.out.println("Disp: " + a + " " + b);// non static block
    }
}