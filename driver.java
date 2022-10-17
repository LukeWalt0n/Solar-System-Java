
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
         

         
         //Draw the earth.
         planet earth = new planet(s, "Earth", 10, 200, 0, 30, "BLUE", 0, 0);
         earth.createPlanet();
         
         planet mars = new planet(s, "Mars", 5, 260 , 40, 40, "RED", 0, 0);
         mars.createPlanet();
        
         planet saturn = new planet(s, "Saturn", 3, 340, 0, 60, "ORANGE", 0, 0);
         saturn.createPlanet();

         moon m = new moon(s, "Moon", 2, 230, 0, 20, "WHITE", earth);
        m.createMoon();

        stars starz = new stars(300, s);
        starz.drawStars();
         

        do{
            earth.orbit();
            mars.orbit();
            m.orbitMoon();
            saturn.orbit();
            s.drawSolarObject(0, 0, 100, "YELLOW");
            s.finishedDrawing();
            starz.drawStars();
        }while(true);

        
        


         
            
        
    }
}