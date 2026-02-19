public class Katze extends Tier {
    private boolean wild;
    private String felltyp;

    public Katze(String art, String futter, int age, boolean wild, String felltyp) {
        super(art, futter, age);
        this.wild = wild;
        this.felltyp = felltyp;
    }

    @Override
    public void gerauschMachen() {
        if (!wild) {
            System.out.println("Miau!");
        } else {
            System.out.println("Roaaar!");
        }
    }

    public String getHaar(){
        return felltyp;
    }

    @Override
    public String toString() {
        return super.toString() + " Felltyp: " + felltyp + " Gemüt: " + felltyp;
    }
}
