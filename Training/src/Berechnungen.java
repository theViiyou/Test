public class Berechnungen {

    public Berechnungen() {

    }

    public static float berechneMittelwert(float[] werte) {
        float mid = 0;

        for (int i = 0; i < werte.length; i++) {
            mid += werte[i];
        }

        return mid / werte.length;
    }
}