public class CelestialObject {

    private double dist;    //Distance from the sun
    private double angle;   //Angle to the sun
    private double diameter;  //Size of the object
    private String colour;  //Colour of the object
    private double moveAmount;

    public CelestialObject(double d, double a, double di, String c){

        this.dist = d;
        this.angle = a;
        this.diameter = di;
        this.colour = c;
    }


    /*
     * Getter for angle as it is private.
     */
    public double getAngle(){
        return this.angle;
    }
    /*
     * Setter for angle.
     */
    public void setAngle(double a){
        this.angle = a;
    }
    /*
     * Getter for distance.
     */
    public double getDist(){
        return this.dist;
    }

    public void setDist(double d){
        this.dist = d;
    }
    /*
     * Getter for diameter.
     */
    public double getDiameter(){
        return this.diameter;
    }

    public void setDiameter(double di){
        this.diameter = di;
    }
    /*
     * Getter for colour.
     */
    public String getColour(){
        return this.colour;
    }

    public void setColour(String s){
        this.colour = s;
    }


    public void orbit(){
        
        //General method for orbiting around the sun, moon class will override and change this.
        this.angle += this.moveAmount;
        if(this.angle >= 360){
            this.angle = 0;
        }

    }
}
