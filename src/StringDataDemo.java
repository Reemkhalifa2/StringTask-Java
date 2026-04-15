public class StringDataDemo {
    public static void main(String[] args) {
        String str = "Java Programing";
        System.out.println(str);

        //toUpperCase() method to display the string in uppercase
        System.out.println(str.toUpperCase());

        //toLowerCase() method to display the string in lowercase
        System.out.println(str.toLowerCase());

        //indexOf() method to find the position of a word
        System.out.println(str.indexOf("Prog"));

        // substring() method to extract part of the string
        System.out.println(str.substring(3,8) );

        //contains() method to check whether the string includes a specific word
        System.out.println(str.contains("Object") );

    }
}
