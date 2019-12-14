package inheritanceAndPolymorphism;

public class Spaghetti extends Noodle {
    Spaghetti() {
        super(2.0, 1.64, "long", "durum flour");

    }

    @Override
    public String getCookPrep() {

        return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";

    }
}