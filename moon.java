public class moon extends SolarSystem {
    private double moveAmount;
    private SolarSystem s;
    private String name;
    private double dist;
    private double angle;
    private double diameter;
    private String colour;
    private double centreOfRotationDist;
    private double centreOfRotationAng;
    private planet p;

    public moon(SolarSystem ss, String n, double ma, double d, double a, double di, String c, double cord, double cora, planet e ){
        super();
        this.s = ss;
        this.name = n;
        this.moveAmount = ma;
        this.dist = d;
        this.angle = a;
        this.diameter = di;
        this.colour = c;
        this.centreOfRotationDist = cord;
        this.centreOfRotationAng = cora;
        this.p = e;
    }

    public void createMoon(){
        this.s.drawSolarObjectAbout(dist, angle, diameter, colour, this.p.getOfRotationDist()+5, this.p.getOfRotationAngle()+5);
    }

    public void orbitMoon(){
        
            
            //How can we make the moon orbit the earth.
            this.angle += 30;
            if(this.angle == 360){
                this.angle =0;
            }
            createMoon();
            s.drawSolarObject(0, 0 , 50, "YELLOW");
            
            //Moon needs to have position the same as the earth each time.



        
    }
}
