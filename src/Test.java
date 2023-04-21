public class Test {
    public static void main(String[] args) {
        Sword<Steel> steelSword = new Sword<Steel>(new Steel());
        if (steelSword.checkEndurance() > 49) {
            System.out.println("Passed");
        } else System.out.println("Not passed");
    }
}
