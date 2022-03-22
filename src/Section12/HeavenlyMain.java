//package Section12;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//public class HeavenlyMain {
//    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
//    private static Set<HeavenlyBody> planets = new HashSet<>();
//
//    public static void main(String[] args) {
//        HeavenlyBody temp = new PlanetHer("Mercury", 88.0D);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        temp = new PlanetHer("Venus", 225D);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        temp = new PlanetHer("Earth", 365);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        HeavenlyBody tempMoon = new Moon("Moon", 27);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        temp = new PlanetHer("Mars", 687);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        tempMoon = new Moon("Deimos", 1.3);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        tempMoon = new Moon("Phobos", 0.3);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        temp = new PlanetHer("Jupiter", 4332);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        tempMoon = new Moon("Io", 1.8);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        tempMoon = new Moon("Europa", 3.5);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        tempMoon = new Moon("Ganymede", 7.1);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        tempMoon = new Moon("Callisto", 16.7);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        temp = new PlanetHer("Saturn", 10759);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        temp = new PlanetHer("Uranus", 30660);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        temp = new PlanetHer("Neptune", 165.0);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        temp = new PlanetHer("Pluto", 248.0);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        System.out.println("Planets");
//        for (HeavenlyBody planet : planets) {
//            System.out.println("\t" + planet.getKey());
//        }
//
//
//        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
//        System.out.println("Moons of " + body.getKey());
//        for (HeavenlyBody jupiterMoon : body.getSatellites()) {
//            System.out.println("\t" + jupiterMoon.getKey());
//        }
//
//
//        Set<HeavenlyBody> moons = new HashSet();
//        for (HeavenlyBody planet : planets) {
//            moons.addAll(planet.getSatellites());
//        }
//
//        System.out.println("All Moons");
//        for (HeavenlyBody moon : moons) {
//            System.out.println("\t" + moon.getKey());
//        }
//
//
//        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
//        planets.add(pluto);
//
//        for (HeavenlyBody planet : planets) {
//            System.out.println(planet);
//        }
//
//        HeavenlyBody earth1 = new PlanetHer("Earth", 365);
//        HeavenlyBody earth2 = new PlanetHer("Earth", 365);
//        System.out.println(earth1.equals(earth2));
//        System.out.println(earth2.equals(earth1));
//        System.out.println(earth1.equals(pluto));
//        System.out.println(pluto.equals(earth1));
//
//        solarSystem.put(pluto.getKey(), pluto);
//        System.out.println(solarSystem.get(HeavenlyBody.makeKey("pluto", HeavenlyBody.BodyTypes.PLANET)));
//        System.out.println(solarSystem.get(HeavenlyBody.makeKey("pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));
//
//        System.out.println();
//        System.out.println("solar system contains");
//        for (HeavenlyBody heavenlyBody : solarSystem.values()) {
//            System.out.println(heavenlyBody);
//        }
//
//    }
//}
