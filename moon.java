
/*
 * A class which represents moons.
 * 
 */
public class moon extends SolarSystem {
    private double moveAmount;
    private SolarSystem s;
    private double dist;
    private double angle;
    private double diameter;
    private String colour;
    private double centreOfRotationAng;
    //How far away the moon is from the earth or the planet.
    private double centreOfRotationDist;
    
    private planet p; //Take a planet so we know what we're orbiting.

    public moon(SolarSystem ss, double ma, double d, double a, double di, String c, planet e, double cord, double cora){
        super();
        this.s = ss;
        this.moveAmount = ma;
        this.dist = d;
        this.angle = a;
        this.diameter = di;
        this.colour = c;
        this.p = e;
        this.centreOfRotationAng = cora;
        this.centreOfRotationDist =cord;
        

    }

    
    public void createMoon(){
        this.s.drawSolarObjectAbout(this.dist, this.angle, this.diameter, this.colour, this.centreOfRotationDist, this.centreOfRotationAng);
    }

    public void orbitMoon(){
        
            
            //How can we make the moon orbit the earth.

            //Centre of rotation angle is the angle angle to the sun so should be the same as the earth.
            this.centreOfRotationAng += p.getMoveAmount();
            this.angle += moveAmount;

            if(this.angle >= 360){
                this.angle =0;
            }
            createMoon();
            //Moon needs to have position the same as the earth each time.
    }
}
