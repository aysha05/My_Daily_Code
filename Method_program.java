class Method_program {
    public static void main(String[] args) {

        System.out.println("froma main()");

        b();
        a();
    }

    public static void a() {
        System.out.println("From a() method");
    }

    public static void b() {
        System.out.println("from b() method");
        c();
    }

    public static void c() {
        System.out.println("From c() method");
    }
}
