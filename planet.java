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
        private double centreOfRotationDist;
        private double centreOfRotationAng;

       
        /*
         * Constructor to get the other details about the planet and also gain access to its solar system
         * @param 
         */
        public planet(SolarSystem ss, String n, double ma, double d, double a, double di, String c, double cord, double cora ){
            super(WIDTH, HEIGHT);
            this.s = ss;
            this.name = n;
            this.moveAmount = ma;
            this.dist = d;
            this.angle = a;
            this.diameter = di;
            this.colour = c;
            this.centreOfRotationDist = cord;
            this.centreOfRotationAng = cora;
        }
        
        /*
         * Method to add a planet to the solar system.
         */
        public void createPlanet(){
            this.s.drawSolarObjectAbout(this.dist, this.angle, this.diameter, this.colour, this.centreOfRotationDist, this.centreOfRotationAng);
        }

        
}