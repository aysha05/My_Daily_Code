class Switch_String {
    public static void main(String[] args) {
        System.out.println("======Welcome======");

        String Monday;

        switch ("Tuesday") {
            case "Monday": {
                System.out.println("only luv yourself.");
                break;
            }
            case "Tuesday": {
                System.out.println("Study hard.");
                break;
            }
            case "Wednesday": {
                System.out.println("Improve Yourself.");
                break;
            }
            case "sunday": {
                System.out.println("Happy & Enjoy.");
                break;
            }
            default: {
                System.out.println("Nothing");
            }
        }
    }
}