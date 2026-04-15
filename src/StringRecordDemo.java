public class StringRecordDemo {
    public static void main(String[] args) {
        String str = "Object Oriented ";
        System.out.println(str);

        //trim() method to remove unnecessary spaces
        System.out.println(str.trim());


        String str1 = "hello";
        String str2 = "HELLO";
        //  equalsIgnoreCase() method to compare them
        System.out.println(str1.equalsIgnoreCase(str2));

        //split() method to divide the cleaned string into parts
        String [] str3 = str.split("e");
        for(String x : str3){
            System.out.println(x);
        }
        String str4 ="";
        // isEmpty() method to check whether it is empty
        System.out.println(str.isEmpty());




    }
}
