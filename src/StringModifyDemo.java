public class StringModifyDemo {
    public static void main(String[] args) {
        String str = " Hello";
        System.out.println(str);

        //trim() method to remove leading and trailing spaces
        System.out.println(str.trim());
        //contains() method to check whether the string contains a specific word
        System.out.println("Is the string have a:" +str.contains("a"));

        // replace() method to change one word in the string
        System.out.println("replace e with #"+ str.replace("e" , "#"));


    }
}
