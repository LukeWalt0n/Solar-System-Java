
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
         s.drawSolarObject(0, 0, 50, "YELLOW");

         
         //Draw the earth.
         planet earth = new planet(s, "Earth", 5, 60, 20, 30, "BLUE", 40, 25);
         earth.createPlanet();


    }
}