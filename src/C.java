public class C implements B, B1 {
    @Override
    public void rice() {
        System.out.println("$1000");
    }

    @Override
    public void sleep() {
        System.out.println("Kho...Kho...");
    }

    public static void main(String[] args) {
        C a = new C();
        a.rice();
        a.sleep();
    }
}
