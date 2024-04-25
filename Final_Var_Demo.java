class Final_Var_Demo {

    public static void main(String[] args) {
        final int i = 10;

        i = i + 20;// error The final local variable i cannot be assigned

        System.out.println(i);
    }

}
