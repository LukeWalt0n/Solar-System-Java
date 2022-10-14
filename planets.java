/*
 * A subclass of the planet class
 */
public class planets extends planet {

    private planet[] p = new planet[7];

    public planets(planet e, planet m){
        super();
        p[0] = e;
        p[1] = m;
    }
}
