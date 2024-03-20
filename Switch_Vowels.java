class Switch_Vowels {
    public static void main(String[] args) {

        char ch = 'b';

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            switch (ch) {
                case 'a':

                case 'i':
                case 'o':
                case 'u':

                case 'A': {
                    System.out.println("It is a vowels.");
                    break;

                }

                default: {
                    System.out.println("It is a consonant");
                }
            }
        } else {
            System.out.println("It is not a alphabet.");
        }

    }
}