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

    public moon(SolarSystem ss, String n, double ma, double d, double a, double di, String c, double cord, double cora ){
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

    public void createMoon(){
        this.s.drawSolarObjectAbout(dist, angle, diameter, colour, centreOfRotationDist, centreOfRotationAng);
    }

    public void orbitMoon(){
        do{
            
            //How can we make the moon orbit the earth.
            this.angle += moveAmount;
            if(this.angle == 360){
                this.angle =0;
            }
            createMoon();
            s.drawSolarObject(0, 0 , 50, "YELLOW");
            s.finishedDrawing();



        }while(true);
    }
}
