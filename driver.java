

class planetThread extends Thread{
    planet planet;
    public planetThread(planet p){
        this.planet = p;
    }
    public void run(){
        this.planet.orbit();
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
         

         planet mars = new planet(s, "Mars", 10, 170 , 0, 50, "ORANGE", 0, 0);
         mars.createPlanet();

        //Add threads:
        planetThread earthThread = new planetThread(earth);
        planetThread marsThread = new planetThread(mars);
        earthThread.start();
        marsThread.start();


         
            
        
    }
}