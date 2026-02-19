public class Player {
    public static final int AAC = 1;
    public static final int MP3 = 2;
    private static String ERROR = "Unbekanntes Format";

    public Player() {

    }

    public static void spiele(int format, String datei) {

        switch (format) {
            case AAC:
                spieleAAC(datei);
                break;

            case MP3:
                spieleMP3(datei);
                break;

            default:
                System.out.println(ERROR);
                break;
        }
    }

    private static void spieleAAC(String datei) {
        System.out.println("AAC data is running");
    }

    private static void spieleMP3(String datei) {
        System.out.println("MP3 data is running.");
    }

}
