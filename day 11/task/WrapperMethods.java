public class WrapperMethods {
    public static void main(String[] args) {

        // valueOf()
        Integer iObj = Integer.valueOf(10);
        Double dObj = Double.valueOf(20.5);
        Boolean bObj = Boolean.valueOf("true");

        System.out.println("valueOf:");
        System.out.println(iObj + " " + dObj + " " + bObj);

        // parseXxx()
        int i = Integer.parseInt("100");
        double d = Double.parseDouble("15.75");

        System.out.println("\nparseXxx:");
        System.out.println(i + " " + d);

        // toString()
        String s1 = iObj.toString();
        String s2 = Double.toString(dObj);

        System.out.println("\ntoString:");
        System.out.println(s1 + " " + s2);

        // compareTo()
        Integer a = 10, c = 20;
        System.out.println("\ncompareTo:");
        System.out.println(a.compareTo(c));

        // equals()
        Integer x = 50, y = 50;
        System.out.println("\nequals:");
        System.out.println(x.equals(y));

        // xxxValue()
        int intVal = iObj.intValue();
        double doubleVal = dObj.doubleValue();

        System.out.println("\nxxxValue:");
        System.out.println(intVal + " " + doubleVal);

        // max(), min()
        System.out.println("\nmax & min:");
        System.out.println(Integer.max(5, 10));
        System.out.println(Integer.min(5, 10));

        // sum()
        System.out.println("\nsum:");
        System.out.println(Integer.sum(5, 10));

        // Character methods
        char ch = 'A';
        System.out.println("\nCharacter methods:");
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.toLowerCase(ch));

        // Boolean methods
        System.out.println("\nBoolean methods:");
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.compare(true, false));
    }
}