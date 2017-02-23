package ch.heigvd.res.lab00;

public class Vent implements IInstrument {
    int volume;
    String couleur;
    String son;

    public Vent(int volume, String couleur, String son) {
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
    
    
    
    
}