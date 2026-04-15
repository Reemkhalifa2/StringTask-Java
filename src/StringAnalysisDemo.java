public class StringAnalysisDemo {
    public static void main(String[] args) {
        String str = " Hello there";
        System.out.println(str);

        // length() method to display the total number of characters
        System.out.println(str.length());
        String str2 = "Welcome";
        //equals() method to compare both strings
        System.out.println(str.equals(str2));

        // indexOf() method to find the position of a character
        System.out.println(str.indexOf("there"));

        // startsWith() method
        System.out.println(str.startsWith("L"));

        // endsWith() method
        System.out.println(str.endsWith("re"));



    }
}
