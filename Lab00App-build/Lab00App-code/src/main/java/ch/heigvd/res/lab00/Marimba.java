package ch.heigvd.res.lab00;

/**
 * Cette classe implémente directement IInstrument, donc les redéfinitions 
 * sont directement ici, au lieu d'hàriter d'une classe intermédiaire 
 * (comme pour les instruments à vent la classe Vent).
 * @author camilo
 */
public class Marimba implements IInstrument {
    
    public Marimba() {
        this(7, "brun", "dumdumdum");
    }

    public Marimba(int volume, String couleur, String son) {
        this.volume = volume;
        this.couleur = couleur;
        this.son = son;
    }
    
    
    @Override
    public String play() {
        return son;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }

    @Override
    public String getColor() {
        return couleur;
}
    
    
    private int volume;
    private String couleur;
    private String son;
    
}