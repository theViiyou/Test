public class Wochentemperatur {

    private float[] mittlereTagesTemperatur;

    public Wochentemperatur() {
        mittlereTagesTemperatur = new float[7];
    }

    public void setzeTageswert(int tag, float[] werte) {
        if (tag > 0 && tag <= 7 && werte != null && werte.length > 0) {
            mittlereTagesTemperatur[tag - 1] = Berechnungen.berechneMittelwert(werte);
        } else {
            System.out.println("Tag muss zwischen 1-7 liegen und werte darf nicht 0 oder leer sein.");
        }
    }
}
