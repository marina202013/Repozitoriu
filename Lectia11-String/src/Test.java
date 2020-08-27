public class Test {
    public static void main(String[] args) {
        // сравнение строк
        boolean b;
        String s1, s2;

        s1 = "Text";
        s2 = "Text";

// операция сравнения ==
    //    b = s1 == s2; // b = true
    //    b = s1 == "TEXT"; // b = false

// метод equals()
    //    b = s1.equals(s2); // b = true
    //    b = s1.equals("TEXT"); // b = false



// операция !=
        if (s1 != s2)
            System.out.println("Строки не равны");
        else
            System.out.println("Строки равны");

// метод equals()
        if (s1.equals(s2))
            System.out.println("Строки равны");
        else
            System.out.println("Строки не равны");
    }
}
