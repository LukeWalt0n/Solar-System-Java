import java.util.Random;

/**
 * Class to represent a comet.
 * Inherits from Celestial object.
 * 
 */
public class Comet extends CelestialObject{

    private SolarSystem s;
    private double speed;
   
    /**
     * Constructor for a comet when a user provides a colour.
     * @param d distance from sun.
     * @param a angle to sun.
     * @param di diameter.
     * @param c colour of comet.
     * @param ma speed of movement.
     * @param ss Solar system it resides in.
     */
    public Comet(double d, double a, double di, String c, double ma, SolarSystem ss){
        super(d, a, di, c);
       
        this.s = ss;
        this.speed = ma;

    }

    /**
     * Secondary constructor for a comet, for a case where a user may not know what colour to use.
     * @param d distance from sun.
     * @param a angle to sun.
     * @param di diameter.
     * @param ma speed of movement.
     * @param ss Solar system it resides in.
     */
    public Comet(double d, double a, double di,double ma, SolarSystem ss){
        //We provide a default colour of RED.
        super(d, a, di, "RED");
        this.s = ss;
        this.speed = ma;
    }

    /**
     * Function to draw a comet to a solar system.
     */
    public void drawComet(){
        s.drawSolarObject(this.getDist(), this.getAngle(), this.getDiameter(), this.getColour());
    }

    /**
     * Function to make comet move across the screen and slowly become smaller or 'burn out'.
     */
    public void burnOut(){

        //To make it fly across the screen we want to increase cora.
        
        Random r = new Random();
        this.setAngle(this.getAngle()-speed);
        this.setDist(this.getDist() - speed);
        //As the comet flies, reduce its size.
        this.setDiameter(this.getDiameter() - 0.1);
        if(this.getDiameter() <0){
            //Use random to generate different locations for the comet to spawn.
            this.setAngle(r.nextDouble(0, 360));
            this.setDist(r.nextDouble(420, 450));
            this.setDiameter(r.nextDouble(20,60));
        }
        drawComet();
        
        
    }

}