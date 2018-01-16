public class Main {

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("brick", i + 1);
            Suitcase suitcase = new Suitcase(101);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }

    public static void main(String[] Container) {
        Suitcase suitcase = new Suitcase(10);

        suitcase.addThing(new Thing("book", 2));
        System.out.println(suitcase.toString());
    }
}
