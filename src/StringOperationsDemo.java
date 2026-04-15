public class StringOperationsDemo {
    public static void main(String[] args) {
        String customerName = "Sara";
        System.out.println("Customer Name: "+ customerName);
        //length() method to display the number of characters in the string
        System.out.println("Number of characters in the string: "+ customerName.length());

        //toUpperCase() method to display the string in uppercase
        System.out.println("Customer Name in uppercase: "+ customerName.toUpperCase());

        //toLowerCase() method to display the string in lowercase
        System.out.println("Customer Name in lowercase: "+ customerName.toLowerCase());

        String companyName = "Codeline";
        //oncat() method to join both strings
        System.out.println(customerName.concat(companyName));

    }
}
