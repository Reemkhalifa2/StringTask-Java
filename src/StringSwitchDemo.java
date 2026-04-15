public class StringSwitchDemo {
    public static void main(String[] args) {
        String department = "Information Technology";
        System.out.println(department);
        switch (department){
            case "Legal":
                System.out.println("legal department");
                break;
            case "HR":
                System.out.println("Hr department");
                break;
            case "marketing":
                System.out.println("marketing department");
                break;
            default:
                System.out.println("wrong department");

        }


    }
}
