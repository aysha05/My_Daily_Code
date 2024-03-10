class parameterized_method {
    public static void main(String[] args) {
        add(10, 2);

        sub(20, 30);

        my(100, 5);

    }

    public static void add(int a, int b) {
        int res = a + b;

        System.out.println(res);
    }

    public static void sub(int b, int c) {
        int ans = b - c;

        System.out.println(ans);
    }

    public static void my(int c, int d) {
        int ans1 = c / d;

        System.out.println(ans1);
    }
}