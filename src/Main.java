public class Main {
    public static void main(String[] args) {

        Istemci i = new Istemci(new Fabrika1());
        i.calistir();

        System.out.println("--------");

        Istemci i2 = new Istemci(new Fabrika2());
        i2.calistir();
    }
}