package W04.javadoc;

/**
 * class has the main task to make a race and print the results
 *
 * @author Levin Schaller
 * @version 1.0
 *
 */
public class Competition {

    private String name;
    private Ship[] ships = new Ship[5];

    /**
     * creates a competition object
     *
     * @param name name of the competition
     */
    public Competition(String name) {
        this.name = name;
    }

    /**
     * starts competition with every ship
     *
     * @see Ship#race()
     */
    public void start() {

        for (Ship s : this.ships) {
            if (s != null) {
                s.race();
            }
        }
    }

    /**
     * adds ship to array
     * @param ship
     */
    public void addShip(Ship ship) {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                break;
            }
        }
    }

    /**
     * prints all results
     */
    public void printResult() {
        System.out.println("Wettkampf: " + this.name);

        for (Ship s : this.ships) {
            if (s != null) {
                System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime());
            }
        }
    }
}
