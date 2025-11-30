import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        // 2 ways to creation
        // String literals:
        String s1 = "Nitish ";

        // using new keyword
        String s2 = new String("Kumar");
        String s3 = new String("kumar");

        // 2 comparison ways
        // ==
        System.out.println(s1 == s2);// false
        // .equals()
        System.out.println(s1.equals(s2)); // false
        System.out.println(s2.equals(s3)); // false

        // Methods:--

        System.out.println("Length of s1: " + s1.length()); // 7
        System.out.println("s1.charAt(0): " + s1.charAt(0)); // N

        System.out.println("Substring(0,4) : " + s1.substring(0, 4)); // Niti
        System.out.println("Substring : " + s1.substring(4)); // sh

        System.out.println(".equals: " + s2.equals(s3)); // false
        System.out.println(".equalsIgnoreCase: " + s2.equalsIgnoreCase(s3)); // true

        System.out.println("Lexicographical comparison: 'abc'.compareTo(abc) -> " + "abc".compareTo("abc")); // 0
        System.out.println("Lexicographical comparison: 'abc'.compareTo(abd) -> " + "abc".compareTo("abd")); // -1
        System.out.println("Lexicographical comparison: 'abf'.compareTo(ab) -> " + "abf".compareTo("abe")); // 1

        System.out.println("UpperCase : " + s1.toUpperCase()); // NITISH
        System.out.println("LowerCase : " + s1.toLowerCase()); // nitish

        System.out.println("Trim removes leading and trailing spaces : " + s1.trim() + s2);
        System.out.println(s1.replace('i', 'e')); //Netesh
        // System.out.println(s1.replaceAll('e', 'i')); //But 'e' and 'i' are char, and replaceAll() only accepts String parameters.
        System.out.println(s1.replace("e", "i")); //Nitish

        System.out.println("s1.contains ('ish') : " + s1.contains("ish")); //true
        System.out.println("s1.startsWith('Ni') : " + s1.startsWith("Ni")); //true
        System.out.println("s1.endsWith('Ni') : " + s1.endsWith("Ni")); //false

        // System.out.println("Nitish Kumar.split() : split breaks string into array : " +"Nitish kumar".split(" "));//we can't directly print the array returned by split()

        System.out.println("Nitish Kumar.split() : split breaks string into array : " + Arrays.toString("Nitish kumar".split(" "))); // [Nitish, kumar]

        System.out.println("s1.IndexOf('i') : " + s1.indexOf("i")); // 1
        System.out.println("s1.lastIndexOf('i') : " + s1.lastIndexOf("i")); // 3

        System.out.println("s1.concat(s2) : " + s1.concat(s2)); // Nitish Kumar

        System.out.println("s1.IsEmpty : " + s1.isEmpty()); //false
        System.out.println("s1.IsBlank : " + s1.isBlank()); //false

        int a=10;
        System.out.println("String.valueOf(10) : " + String.valueOf(a)); //converts primitive to string
        System.out.println("String.valueOf(true) : " + String.valueOf(true));
        



    }
}
