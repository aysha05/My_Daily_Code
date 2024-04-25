class Final_method_Demo {
    final void m1() {// error final method cannot override
        System.out.println("i am in demo");
    }
}

class Test extends Final_method_Demo {
    void m1() {
        System.out.println("i am in test");
    }

    public static void main(String[] args) {

    }
}
