public class Fisch extends Tier implements Schwimmfaehig {
    private float temperatur;
    private boolean sueßwasser;

    public Fisch(String art, String food, int age, float temperatur, boolean sueßwasser) {
        super(art, food, age);
        this.temperatur = temperatur;
        this.sueßwasser = sueßwasser;
    }

    @Override
    public void gerauschMachen() {
        System.out.println("Blubb, blubb!");
    }

    @Override
    public void schwimmen() {
        System.out.println("schwimm schwimm!");
    }

    @Override
    public String toString() {
        return super.toString() + " Bevorzugte Temperatur: " + temperatur + " Celsius" + " Wasserart: "
                + (sueßwasser ? "sueßwaser" : "salzwasser");
    }
}
