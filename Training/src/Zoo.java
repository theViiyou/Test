import java.util.ArrayList;

public class Zoo {
    private ArrayList<Tier> tiere;

    public Zoo() {
        tiere = new ArrayList<>();
    }

    public void tiereAusgeben() {

        for (Tier tier : tiere) {
            System.out.println(tier);

            if (tier instanceof Katze) {
                tier.gerauschMachen();
            }
        }
    }

    public void alleSchwimmen() {

        for (Tier tier : tiere) {
            if (tier instanceof Schwimmfaehig) {
                ((Schwimmfaehig) tier).schwimmen();
            }
        }
    }

    public ArrayList<Katze> gibLanghaar() {
        ArrayList<Katze> langhaarKatzen = new ArrayList<>();

        for (Tier t : tiere) {
            if (t instanceof Katze k && k.getHaar().equals("langhaarig")) {
                langhaarKatzen.add(k);
            }
        }
        return langhaarKatzen;
    }
}
