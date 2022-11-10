
/**
 * A class which represents a planet.
 * It inherits from the parent class CelestialObject.
 * A planet is essentially a circle on the screen.
 */
public  class Planet extends CelestialObject {
    

    private SolarSystem s;
    private double orbitSpeed;
    private double tempAngle;

    /**
     * Constructor for a planet.
     * @param d distance from the sun.
     * @param a angle to the sun.
     * @param di diameter.
     * @param c Colour.
     * @param ma MoveAmount - how fast the planet should move.
     * @param ss The solar system in which the planet resides.
     */
    public Planet(double d, double a, double di, String c, double ma, SolarSystem ss){
        super(d, a, di, c);
        this.orbitSpeed = ma;
        this.s = ss;
    }

    
    /**
     * This method returns the orbit speed of the planet.
     * @return this.orbitSpeed - the orbit speed of the planet.
     */
    public double getOrbitSpeed(){
        return this.orbitSpeed;
    }
    
    
    /**
     * Function to draw a planet to the screen.
     */
    public void createPlanet()
    {
            this.s.drawSolarObject(this.getDist(), this.getAngle(), 
            this.getDiameter(), this.getColour());
    }


    /**
     * Override of orbit method to make planet orbit around the sun.
     * When the angle gets to 360, reset it.
     */
    @Override
    public void orbit()
    {
        //Increase the angle by orbitSpeed.
        tempAngle = this.getAngle() + orbitSpeed;
        this.setAngle(tempAngle);
        if(this.getAngle() >= 360){
            this.setAngle(0);
        }
        createPlanet();
    }
}
