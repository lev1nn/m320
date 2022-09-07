package W04.javadoc;

public class Competition {

    private String name;
    private Ship[] ships = new Ship[5];

    public Competition(String name) {
        this.name = name;
    }

    public void start() {

        for (Ship s : this.ships) {
            if (s != null) {
                s.race();
            }
        }
    }

    public void addShip(Ship ship) {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                break;
            }
        }
    }

    public void printResult() {
        System.out.println("Wettkampf: " + this.name);

        for (Ship s : this.ships) {
            if (s != null) {
                System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime());
            }
        }
    }
}
