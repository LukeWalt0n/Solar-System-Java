
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
         

         planet mercury = new planet(s, "Mercury", 14, 150, 360, 20, "GREEN", 0, 0);
         mercury.createPlanet();

         planet venus = new planet(s, "venus", 12, 170, 48, 25, "CYAN", 0, 0);
         venus.createPlanet();
         //Draw the earth.
         planet earth = new planet(s, "Earth", 10, 200, 80, 30, "BLUE", 0, 0);
         earth.createPlanet();
         
         planet mars = new planet(s, "Mars", 8, 260 , 40, 40, "RED", 0, 0);
         mars.createPlanet();
        
         planet jupiter = new planet(s, "Jupiter", 6, 280, 60, 50, "CYAN", 0, 0);
         jupiter.createPlanet();

         planet saturn = new planet(s, "Saturn", 4, 340, 30, 60, "ORANGE", 0, 0);
         saturn.createPlanet();

         planet uranus = new planet(s, "uranus", 6, 380, 20, 20, "BLUE", 0, 0);
         uranus.createPlanet();

         moon m = new moon(s, "Moon", 2, 230, 0, 20, "WHITE", earth);
        m.createMoon();

        stars starz = new stars(300, s);
        starz.drawStars();
         

        do{
            earth.orbit();
            mars.orbit();
            m.orbitMoon();
            mercury.orbit();
            venus.orbit();
            jupiter.orbit();
            uranus.orbit();
            saturn.orbit();
            s.drawSolarObject(0, 0, 100, "YELLOW");
            s.finishedDrawing();
            starz.drawStars();
        }while(true);

        
        


         
            
        
    }
}