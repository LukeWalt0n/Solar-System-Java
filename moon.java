
/*
 * A class which represents a moon orbiting a planet.
 * 
 */

public class Moon extends CelestialObject {

    /*
     * We use centre of rotation angle and distance to make the moon orbit the earth.
     */
    private SolarSystem s;
    private double orbitSpeed;
    private double tempAngle;
    private double centreOfRotationDist;
    private double centreOfRotationAngle;
    private Planet plan;


    public Moon(Planet p, double d, double a, double di, String c, double ma, SolarSystem ss, double cord, double cora){
        //Call to parent class celestialObject.
        super(d, a, di, c);
        this.orbitSpeed = ma;
        this.s = ss;
        this.centreOfRotationDist = cord;
        this.centreOfRotationAngle = cora;
        this.plan = p;
    }

    public void createMoon(){
        //Calls solar system method to draw a moon about a planet.
        this.s.drawSolarObjectAbout(this.getDist(), this.getAngle(), 
            this.getDiameter(), this.getColour(), this.centreOfRotationDist, this.centreOfRotationAngle );
    }

    /*
     * Overrides orbit method to be useable by moons
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
