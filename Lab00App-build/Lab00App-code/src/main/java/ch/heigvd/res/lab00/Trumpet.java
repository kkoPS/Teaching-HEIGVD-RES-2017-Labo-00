package ch.heigvd.res.lab00;

public class Trumpet extends Vent {
    
    public Trumpet(int volume, String couleur, String son) {
        super(volume, couleur, son);
    }
    
    public Trumpet() {
        this(12, "golden", "pouet");
    }
    
}