public class HelloApp {
    public static void main(String[] args) {
        HelloJOP myJOP = new HelloJOP(); // object creation - creates an instance of HelloJOP class and assigns it to
                                         // the variable myJOP
        HelloSOUT mySOUT = new HelloSOUT(); // This creates a new instance of the HelloSOUT class and assigns it to the
                                            // variable mySOUT.

        myJOP.sayHello();
        mySOUT.sayHello();
    }
}
