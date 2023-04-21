public class Test {
    private static int Steel;
    public static void main(String[] args) {
        Sword<Copper> steelSword = new Sword<Copper>(new Copper());
        if (steelSword.checkEndurance() == Steel > 49) {
            System.out.println("Passed");
        } else System.out.println("Not passed");

    }
}
