public class PersonalGreeting {
    public static void main(String[] args) {
        String fn = args[0];
        String ln = args[1];
        String n = fn + " " + ln;
        System.out.println("Hello " + n);
    }
}