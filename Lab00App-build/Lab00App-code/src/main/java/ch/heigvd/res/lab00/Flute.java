package ch.heigvd.res.lab00;

public class Flute extends Vent {
    
    public Flute(int volume, String couleur, String son) {
        super(volume, couleur, son);
    }
    
    public Flute() {
        this(9, "gris", "FUUUuuuu");
    }
    
    
}