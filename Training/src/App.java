
public class App {

    static float [] array = new float [] {1f,0f,3f,2.4f,};
    static Fisch fisch = new Fisch("Hai", "Robben", 5, 17, false);

    public static void main(String[] args) throws Exception {
        System.out.println("\nHello, World!");
        System.out.println(Berechnungen.berechneMittelwert(array));
        float mid = Berechnungen.berechneMittelwert(array);
        System.out.println(mid);
        fisch.schwimmen();
        String song = "songACC";
        Player.spiele(Player.AAC,song);
    }
}
