public class moon extends SolarSystem {
    private double moveAmount;
    private SolarSystem s;
   
    private double dist;
    private double angle;
    private double diameter;
    private String colour;
    
    private planet p;

    public moon(SolarSystem ss, String n, double ma, double d, double a, double di, String c, planet e){
        super();
        this.s = ss;
        this.moveAmount = ma;
        this.dist = d;
        this.angle = a;
        this.diameter = di;
        this.colour = c;
        this.p = e;
    }

    public void createMoon(){
        this.s.drawSolarObjectAbout(dist, angle, diameter, colour, this.p.getOfRotationDist()+5, this.p.getOfRotationAngle()+5);
    }

    public void orbitMoon(){
        
            
            //How can we make the moon orbit the earth.
            this.angle += moveAmount;
            if(this.angle == 360){
                this.angle =0;
            }
            createMoon();
            s.drawSolarObject(0, 0 , 50, "YELLOW");
            
            //Moon needs to have position the same as the earth each time.



        
    }
}
