

class planetThread extends Thread{
    planet planet;
    public planetThread(planet p){
        this.planet = p;
    }
    public void run(){
        this.planet.orbit();
    }
}

class moonThread extends Thread{
    moon mn;
    public moonThread(moon m){
        this.mn = m;
    }
    public void run(){
        this.mn.orbitMoon();
    }
}




/*
 * A class which allows us to execute code from the solar system class.
 * Just a main class.
 */
public class driver{

    public static void main(String args[]){
        /*
         * Task is to create a simple moving model of the solar system.
         * Adding planets such as earth, the sun, etc and making them roate around the sun.
         */


         //Create a window:
         SolarSystem s = new SolarSystem(1000, 1000);

         //Draw a sun in the window:
         s.drawSolarObject(0, 0, 150, "YELLOW");

         
         //Draw the earth.
         planet earth = new planet(s, "Earth", 10, 100, 0, 30, "BLUE", 0, 0);
         earth.createPlanet();
         

         planet mars = new planet(s, "Mars", 10, 170 , 40, 50, "ORANGE", 0, 0);
         mars.createPlanet();

         moon m = new moon(s, "Moon", 5, 130, 0, 20, "WHITE", 0, 0);
        m.createMoon();
         


        //Add threads:
        planetThread earthThread = new planetThread(earth);
        planetThread marsThread = new planetThread(mars);
        moonThread mt = new moonThread(m);
        earthThread.start();
        marsThread.start();
        mt.start();
        


         
            
        
    }
}