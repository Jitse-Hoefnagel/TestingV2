public class Main {

    public static void name(String name) {
        System.out.println("Welcome " + name);
    }

    public static void age(int age) {
        System.out.println("You seem to be " + age + " years old.");
    }
    public static void hobby(String hobby){
        System.out.println("Wow, " + hobby + " What an interesting hobby!");
    }
    public static void main(String[] args) {
        Main intro = new Main();
        Main.name("Jitse");
        Main.age(26);
        Main.hobby("Waterpolo");
    }
}