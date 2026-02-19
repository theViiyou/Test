import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class Automat {

    public HashMap<String, Getraenk> getraenke;

    public Automat() {

        getraenke = new HashMap<>();

    }

    public void einfuegen(Getraenk getraenk) {

        if (getraenk != null) {
            String nr = getraenk.getBestellnummer();
            Getraenk alt = getraenke.get(nr);

            if (!getraenke.containsKey(nr)) {
                getraenke.put(nr, getraenk);

            } else if (getraenk.getFuellmenge() > alt.getFuellmenge()) {
                getraenke.put(nr, getraenk);
            }
        } else {
            return;
        }
    }

    public ArrayList<Getraenk> gibGetraenkeMitName(String name) {

        ArrayList<Getraenk> names = new ArrayList<>();
        Iterator<Getraenk> it = getraenke.values().iterator();

        while (it.hasNext()) {
            Getraenk g = it.next();
            if (g.getName().equals(name))
                names.add(g);
        }
        return names;
    }
}
