package inheritanceAndPolymorphism;

class Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public void cook() {
        System.out.println("Boiling.");

        this.texture = "cooked";

    }

    final public boolean isTasty() {
        return true;
    }

    public String getCookPrep() {

        return "Boil noodle for 7 minutes and add sauce.";

    }

    public static void main(String[] args) {

        Pho phoChay = new Pho();
        System.out.println(phoChay.shape);

        System.out.println("-------------------------------------------------");

        Spaghetti spaghettiPomodoro = new Spaghetti();
        System.out.println(spaghettiPomodoro.texture);

        System.out.println("-------------------------------------------------");

        Ramen yasaiRamen = new Ramen();
        System.out.println(yasaiRamen.isTasty());
        System.out.println(yasaiRamen.ingredients);

        System.out.println("-------------------------------------------------");

        Spaetzle kaesespSpaetzle = new Spaetzle();
        kaesespSpaetzle.cook();

        System.out.println("-------------------------------------------------");

        Noodle spaghetti, ramen, pho;

        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();

        Noodle[] allTheNoodles = { spaghetti, ramen, pho };

        for (Noodle noodle : allTheNoodles) {
            System.out.println(noodle.getCookPrep());
        }

        System.out.println("-------------------------------------------------");

    }

}