
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
         

         planet mercury = new planet(s, 2, 150, 360, 20, "GREY");
         mercury.createPlanet();

         planet venus = new planet(s, 2, 170, 48, 25, "ORANGE");
         venus.createPlanet();
         //Draw the earth.
         planet earth = new planet(s,  2, 200, 0, 30, "BLUE");
         earth.createPlanet();
         
         planet mars = new planet(s,  2, 260 , 40, 40, "RED");
         mars.createPlanet();
        
         planet jupiter = new planet(s, 2, 280, 60, 50, "YELLOW");
         jupiter.createPlanet();

         planet saturn = new planet(s, 2, 340, 30, 60, "ORANGE");
         saturn.createPlanet();

         planet uranus = new planet(s,  2, 380, 20, 20, "BLUE");
         uranus.createPlanet();

         //Move amount is what we 
         moon m = new moon(s, 3, 50, 0, 10, "WHITE", earth, 200, 0 );
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