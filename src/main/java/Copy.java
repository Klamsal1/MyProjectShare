public class Copy extends Book{


    public Copy(String name) {
        super(name);
    }

    // Method overriding
    @Override
    public void sound() {
        System.out.println(name + " barks");
    }
}

