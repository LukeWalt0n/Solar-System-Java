import java.util.Random;

/*
 * Class to represent stars.
 * Stars are drawn randomly to the screen.
 */
public class Stars {

    //The amount of stars in the solar system
    private int amount;
    //The solar system (window) the stars will reside in.
    private SolarSystem s;

    public Stars(int a, SolarSystem ss){
        this.amount = a;
        this.s = ss;

    }

    /*
     * Method to draw the stars to the screen.
     * Uses a for loop to draw 'x' amount of stars giving them a random angle and distance each time.
     * Edited to be asteroids
     */
    public void drawAsteroids(){
        Random r = new Random();
        
        for(int i =0; i < this.amount; i++){
            this.s.drawSolarObject(r.nextInt(180, 200), r.nextInt(360),r.nextInt(1,2), "WHITE");
        }
       
           
    }

    public void drawStars(){
        Random r = new Random();
        
        for(int i =0; i < this.amount; i++){
            this.s.drawSolarObject(r.nextInt(600), r.nextInt(360),r.nextInt(2,3), "WHITE");
        }
       
           
    }

}
