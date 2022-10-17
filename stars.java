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


    /*
     * Method to draw the stars to the screen.
     * Uses a for loop to draw 'x' amount of stars giving them a random angle and distance each time.
     */
    public void drawStars(){
        Random r = new Random();
        
        for(int i =0; i < this.amount; i++){
            System.out.println("HELLO" + i);
            this.s.drawSolarObject(r.nextInt(400), r.nextInt(360),r.nextInt(8), "WHITE");
        }
       
           
    }
}
