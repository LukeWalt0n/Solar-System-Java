import java.util.Random;
import java.util.random.*;
/*
 * Star class to represent stars.
 */
public class stars {
    
    //The amount of stars we want.
    private int amount;
    private SolarSystem s;

    public stars(int a, SolarSystem ss){
        this.amount = a;
        this.s = ss;
    }


    public void drawStars(){
        Random r = new Random();
        int x = 0;
        for(int i =0; i < this.amount; i++)
            this.s.drawSolarObject(x, x+10,20, "WHITE");
            x += 10;
    }
}
