public class driver {
    
    public static void main(String args[]){

        double acceleration = Double.parseDouble(args[0]);
        //Create a solar system.
        SolarSystem s = new SolarSystem(1000, 1000);

        //Create a sun.
        s.drawSolarObject(0, 0, 75, "YELLOW");

        //Create earth and draw it to the screen.
        Planet earth = new Planet(150, 0, 20, "BLUE", 2*acceleration, s);
        earth.createPlanet();

        //Create a moon for earth.
        Moon earthMoon = new Moon(earth, 25, 0, 5, "WHITE", 3*acceleration, s, 150, 0);
        earthMoon.createMoon();

        Stars strs = new Stars(200, s);
        strs.drawStars();

        //Add appropriate planets to solar system
       Planet mercury = new Planet(100, 20, 10, "GREY", 4*acceleration, s);
       mercury.createPlanet();

       Planet venus = new Planet(120, 67, 15, "ORANGE", 3*acceleration, s);
       venus.createPlanet();

       Planet mars = new Planet(160, 90, 25, "RED", 2*acceleration, s);
       mars.createPlanet();

       Planet jupiter = new Planet(250, 0, 30, "#f7d577",0.5*acceleration, s);
       jupiter.createPlanet();

       Moon europa = new Moon(jupiter, 50, 0, 10, "WHITE", 3*acceleration, s, 250, 0);
       europa.createMoon();

       Planet saturnRing = new Planet(320, 80, 40, "#ceb8b8", 0.2*acceleration, s);
       saturnRing.createPlanet();
       Planet saturn = new Planet(320, 80, 30,"#c3a171",0.2*acceleration, s);
       saturn.createPlanet();

       Planet uranus = new Planet(360, 20, 35, "#d1e7e7", 0.2*acceleration, s );
       uranus.createPlanet();

       Planet neptune = new Planet(400, 280, 40, "#4b70dd", 0.1*acceleration, s);
       neptune.createPlanet();
       
       Comet com = new Comet( 420, 180, 20, "ORANGE", 0.1 , s);
        com.burnOut();
       

        //Orbit indefinietly.
        do{
            earth.orbit();
            earthMoon.orbit();
            strs.drawAsteroids();
            //strs.drawStars();
            mercury.orbit();
            venus.orbit();
            mars.orbit();
            jupiter.orbit();
            europa.orbit();
            saturnRing.orbit();
            saturn.orbit();
            uranus.orbit();
            neptune.orbit();
            com.burnOut();
            //Re-draw the sun each time.
            s.drawSolarObject(0, 0, 100, "YELLOW");
            //Call finished drawing to re-draw objects to the screen.
            s.finishedDrawing();
        }while(true);
    }
}
