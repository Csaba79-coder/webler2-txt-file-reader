package hu.webler.scope;

public class I {

    private String i = "i";

    public static void main(String[] args) {
        I i = new I();
        i.i();
    }

    public static String i(String i) {
        return i;
    }

    public void i() {
        for (int i = 0; i < this.i.length(); i++) {
            System.out.println(i);
        }
        String i = i(this.i);
        System.out.println(i);
    }
}
