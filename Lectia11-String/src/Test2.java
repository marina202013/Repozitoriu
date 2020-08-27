public class Test2 {
    public static void main(String[] args) {

        // метод length()
        String s;

        s = "Method length()";

        int n;
        n = s.length(); // n = 15
        System.out.println("Длина строки: " +n);

        char c;
        c = s.charAt(0); // c = 'M'
        System.out.println(c);
        c = s.charAt(1); // c = 'e'
        System.out.println(c);
        c = s.charAt(2); // c = 't'
        System.out.println(c);
        c = s.charAt(3); // c = 'h'
        System.out.println(c);
    }
}
