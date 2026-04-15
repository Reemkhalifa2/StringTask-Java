public class StringProcessDemo {
    public static void main(String[] args) {
        String employeesID = "A12,A13,A14,A15 ";
        System.out.println(employeesID);

        //trim() method to remove unnecessary spaces
        System.out.println(employeesID.trim());

        //split() method to separate the record into different parts
        String[] employees = employeesID.split(",");
        for(String emp : employees){
            System.out.println(emp);
        }

        String str1 = "hello";
        String str2 = "HELLO";
        //  equalsIgnoreCase() method to compare them
        System.out.println(str1.equalsIgnoreCase(str2));

        String str = "";
        //  equalsIgnoreCase() method to compare them
        System.out.println(str.isEmpty());




    }
}
