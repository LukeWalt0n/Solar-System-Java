import java.util.Random;


/**
 * A class which represents stars and asteroids.
 */
public class Stars {

    //The amount of stars in the solar system
    private int amount;
    //The solar system (window) the stars will reside in.
    private SolarSystem s;


    /**
     * 
     * @param a the amount of stars/asteroids.
     * @param ss the solar system to draw them in.
     */
    public Stars(int a, SolarSystem ss){
        this.amount = a;
        this.s = ss;

    }

     
    /**
     * Method to draw asteroid belt using stars.
     * Draws them in a circle around the sun at different angles with different sizes.
     */
    public void drawAsteroids(){
        Random r = new Random();
        
        for(int i =0; i < this.amount; i++){
            this.s.drawSolarObject(r.nextInt(180, 200), r.nextInt(360),r.nextInt(1,5), "WHITE");
        }
       
           
    }

    /**
     * Method to draw stars on the screen at random locations.
     */
    public void drawStars(){
        Random r = new Random();
        
        for(int i =0; i < this.amount; i++){
            this.s.drawSolarObject(r.nextInt(500), r.nextInt(360),r.nextInt(1,2), "WHITE");
        }
       
           
    }

}
