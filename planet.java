/*
 * Class to represent a planet.
 * A planet is a circle on the screen which can orbit another object.
 */
public  class Planet extends CelestialObject {
    
    private SolarSystem s;
    private double orbitSpeed;
    private double tempAngle;

    public Planet(double d, double a, double di, String c, double ma, SolarSystem ss){
        super(d, a, di, c);
        this.orbitSpeed = ma;
        this.s = ss;
    }

    /*
     * Method to return the orbit speed of the planet.
     * This is so the moon class can use this value to match the speed of the planet when orbiting the sun.
     */
    public double getOrbitSpeed(){
        return this.orbitSpeed;
    }
    
    /*
     * Calls to solarSystem method to draw an object to the screen.
     */
    public void createPlanet()
    {
            this.s.drawSolarObject(this.getDist(), this.getAngle(), 
            this.getDiameter(), this.getColour());
    }


    /*
     * Override of celestialObject method 'orbit'
     * In this case we just increase the planets angle to the sun on each call of this method.
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
