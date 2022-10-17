
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
         planet earth = new planet(s, "Earth", 10, 150, 0, 30, "BLUE", 0, 0);
         earth.createPlanet();
         
         planet mars = new planet(s, "Mars", 5, 230 , 40, 50, "ORANGE", 0, 0);
         mars.createPlanet();

         moon m = new moon(s, "Moon", 2, 180, 0, 20, "WHITE", earth);
        m.createMoon();

        stars starz = new stars(100, s);
        starz.drawStars();
         

        do{
            earth.orbit();
            mars.orbit();
            m.orbitMoon();
            starz.drawStars();
            s.drawSolarObject(0, 0, 100, "YELLOW");
            s.finishedDrawing();
        }while(true);

        
        


         
            
        
    }
}