

/**
 * A class to represent a moon.
 * A moon is a circle on the screen which orbits a planet, while orbiting the sun.
 */
public class Moon extends CelestialObject {

    
    /**
     * Instance variables needed for a moon.
     */
    private SolarSystem s;
    private double orbitSpeed;
    private double tempAngle;
    private double centreOfRotationDist;
    private double centreOfRotationAngle;
    private Planet plan;


    /**
     * Constructor for a moon.
     * @param p the planet which the moon orbits.
     * @param d the distance of the moon from the planet.
     * @param a the angle of the moon to the planet.
     * @param di the diameter of the moon.
     * @param c the colour of the moon.
     * @param ma the speed at which the moon orbits.
     * @param ss the solar system the moon resides in.
     * @param cord the distance between the sun and the moon
     * @param cora the angle of the moon to the sun.
     */
    public Moon(Planet p, double d, double a, double di, String c, double ma, SolarSystem ss, double cord, double cora){
        //Call to parent class celestialObject.
        super(d, a, di, c);
        this.orbitSpeed = ma;
        this.s = ss;
        this.centreOfRotationDist = cord;
        this.centreOfRotationAngle = cora;
        this.plan = p;
    }

    /**
     * Function to draw the moon to the screen.
     */
    public void createMoon(){
        //Calls solar system method to draw a moon about a planet.
        this.s.drawSolarObjectAbout(this.getDist(), this.getAngle(), 
            this.getDiameter(), this.getColour(), this.centreOfRotationDist, this.centreOfRotationAngle );
    }

    
    /**
     * Override method to allow the moon to orbit its planet.
     */
    @Override
    public void orbit()
    {   
        //Increase cora by the planets orbit speed so that it keeps up with the planet orbiting the sun.
        centreOfRotationAngle += plan.getOrbitSpeed();
        //Then increase the angle of the moon to the earth.
        tempAngle = this.getAngle() + orbitSpeed;
        this.setAngle(tempAngle);
        //Bounds of the angle.
        if(tempAngle >= 360){
            this.setAngle(0);
        }
        //Call to draw the moon to the screen.
        createMoon();
    }
}
