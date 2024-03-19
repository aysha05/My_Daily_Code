class instance_block {
    int a, b;

    static void show() {

        System.out.println("static method ");

    }

    instance_block() {
        a = 40;
        b = 80;
        System.out.println("Constructor: " + a + " " + b);
    }

    {
        a = 50;
        b = 100;

        System.out.println("instance block: " + a + " " + b);
    }
}

class D {

    public static void main(String[] args) {

        instance_block.show();

        instance_block C = new instance_block();
        // instance_block.show();

    }
}
