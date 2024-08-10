public class GenericExample {
    public static void main(Strings[] args) {
        shout("John");
        shout(57);
        shout(new Cat());
    }

    private static <T> void shout(T thingToShout) {
        System.out.println(ThingToShot + "!!!!");
    }
}