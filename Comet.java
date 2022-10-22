import java.util.Random;
/*
 * Class which represents comets.
 */
public class Comet extends CelestialObject{

    private SolarSystem s;
    private double speed;
   

    public Comet(double d, double a, double di, String c, double ma, SolarSystem ss){
        super(d, a, di, c);
       
        this.s = ss;
        this.speed = ma;

    }

    public void drawComet(){
        s.drawSolarObject(this.getDist(), this.getAngle(), this.getDiameter(), this.getColour());
    }
    public void burnOut(){

        //To make it fly across the screen we want to increase cora.
        
        Random r = new Random();
        this.setAngle(this.getAngle()-speed);
        this.setDist(this.getDist() - speed);
        //As the comet flies, reduce its size.
        this.setDiameter(this.getDiameter() - 0.1);
        if(this.getDiameter() <0){
            //Use random to generate different locations for the comet to spawn.
            this.setAngle(r.nextDouble(0, 360));
            this.setDist(r.nextDouble(420, 450));
            this.setDiameter(r.nextDouble(20,60));
        }
        drawComet();
        
        
    }

}