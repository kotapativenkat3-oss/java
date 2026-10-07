public class Practice_java{
    public static void main(String[] args){
        String day="Monday";

        switch(day){
            case "sunday" -> System.out.println("7am");

            case "Monday" -> System.out.println("8am");
            case "Tuesday" -> System.out.println("6am");
            default -> System.out.println("Enter a valid day");
        }
    }
}