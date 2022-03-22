package Section12;

public class PlanetHer extends HeavenlyBody{
    public PlanetHer(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }


    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyType()== BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }


}
