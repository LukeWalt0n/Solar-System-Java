public class CelestialObject {

    private double dist;    //Distance from the sun
    private double angle;   //Angle to the sun
    private double diameter;  //Size of the object
    private String colour;  //Colour of the object
    private double moveAmount;

    /**
     * Super constructor for a celestial object.
     * @param d distance from the sun.
     * @param a angle to the sun.
     * @param di diameter of the object.
     * @param c colour of the object.
     */
    public CelestialObject(double d, double a, double di, String c){

        this.dist = d;
        this.angle = a;
        this.diameter = di;
        this.colour = c;
    }


    /**
     * Function to return angle value.
     * @return this.angle.
     */
    public double getAngle(){
        return this.angle;
    }

    /**
     * Function to set the angle.
     * @param a angle passed as parameter.
     */
    public void setAngle(double a){
        this.angle = a;
    }
    
    /**
     * Function to return distance value.
     * @return this.dist
     */
    public double getDist(){
        return this.dist;
    }

    /**
     * Function to set distance variable.
     * @param d distance parameter.
     */
    public void setDist(double d){
        this.dist = d;
    }

   /**
    * Function to get the diameter.
    * @return this.diameter.
    */
    public double getDiameter(){
        return this.diameter;
    }

    /**
     * Function to set diameter.
     * @param di diameter parameter.
     */
    public void setDiameter(double di){
        this.diameter = di;
    }
    
    /**
     * Function to get colour.
     * @return this.colour
     */
    public String getColour(){
        return this.colour;
    }

    /**
     * Function to set colour of object.
     * @param s colour provided.
     */
    public void setColour(String s){
        this.colour = s;
    }


    /**
     * General method to allow an object to orbit the sun.
     */
    public void orbit(){
        
        //General method for orbiting around the sun, moon class will override and change this.
        this.angle += this.moveAmount;
        if(this.angle >= 360){
            this.angle = 0;
        }

    }
}
