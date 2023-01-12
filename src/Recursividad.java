public class Recursividad {
    public static String starAdyacente(String str) {
        if (str.length() < 2) {
            System.out.println(str.charAt(0));
        } else {
            if (str.charAt(0) == str.charAt(1)) {
                System.out.print(str.charAt(0) + "*");
            } else {
                System.out.println(str.charAt(0));
            }
        }
        return starAdyacente(str.substring(1, str.length()));
    }

}
