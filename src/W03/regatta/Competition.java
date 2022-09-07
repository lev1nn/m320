package W03.regatta;

import java.util.ArrayList;

public class Competition {
    private String name;
    ArrayList<Ship> ships = new ArrayList<Ship>();

    public Competition(String name) {
        this.name = name;
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void start() {
        for (int i = 0; i < ships.size(); i++) {
            ships.get(i).race();
        }
    }

    public void printResult() {
        System.out.printf("Wettkampf: %s%n", name);

        for (Ship s : this.ships) {
            if (s != null) {
                String ownerOutput = "Besitzer: ";

                Person owner = s.getOwner();
                if (owner != null) {
                    ownerOutput += owner.getFirstName() + " " + owner.getLastName();
                }

                System.out.printf("Schiff Nr: %d | Name: %12s | Zeit: %d | %s%n", s.getNumber(), s.getName(), s.getTime(), ownerOutput);

                /* for (int i = 0; i < ships.length; i++) {
                    System.out.printf("Schiff Nr: %d | Name: %12s | Zeit: %d | Owner: %s%n", ships[i].getNumber(), ships[i].getName(), ships[i].getTime(), ships[i].getOwner());
                } */
            }
        }
    }
}
