public class Getraenk {
    
    public String bestellnummer;
    public String name;
    public float fuellmenge;
    public float preis;

    public Getraenk(String bestellnummer, String name, float fuellmenge, float preis){
        this.bestellnummer = bestellnummer;
        this.name = name;
        this.fuellmenge = fuellmenge;
        this. preis = preis;
    }

    public String getBestellnummer(){
        return bestellnummer;
    }

    public String getName(){
        return name;
    }

    public float getFuellmenge(){
        return fuellmenge;
    }

    public float getPreis(){
        return preis;
    }
}
