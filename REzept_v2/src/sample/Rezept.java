package sample;

public class Rezept {
    public String name;
    public String[] zutaten;
    public String[] schritte;

    public Rezept(String s) {
        this.name=s;
    }

    public void AddZutat(String zutat){
        this.zutaten[zutaten.length]=zutat;
    }

    public void AddSchritt(String schritt){
        this.schritte[schritte.length]=schritt;
    }
}
