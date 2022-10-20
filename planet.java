/*
 * A class to represent planets.
 * Will contain a move method.
 * Planet extends solar system as they share the same variables so we may aswell use them.
 */
public class planet extends SolarSystem {
    
    private double moveAmount;
    private SolarSystem s;
    private String name;
    private double dist;
    private double angle;
    private double diameter;
    private String colour;
    
    /*
    * Constructor to get the other details about the planet and also gain access to its solar system
    * @param 
    */
    public planet(SolarSystem ss,  double ma, double d, double a, double di, String c ){
        super();
        this.s = ss;
        this.moveAmount = ma;
        this.dist = d;
        this.angle = a;
        this.diameter = di;
        this.colour = c;
        
    }
        


       
        
        public double getDistanceFromSun(){
            return this.dist;
        }

        public double getAngleFromSun(){
            return this.angle;
        }

        public double getMoveAmount(){
            return this.moveAmount;
        }

        
        public void createPlanet()
        {
            this.s.drawSolarObject(dist, angle, diameter, colour);
        }      


        /*
         * A method which makes a planet orbit the sun.
         */
        public void orbit(){

            //Use move amount for scalability.
                this.angle += moveAmount;
                if(this.angle == 360){
                    this.angle =0;
                }
                createPlanet();
                
               
            
        }


        

        
}
