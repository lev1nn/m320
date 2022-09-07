package W02.regatta;

public class Competition {
    private String name;
    Ship[] ships = new Ship[3];

    public Competition(String name) {
        this.name = name;
    }

    public void addShip(Ship ship) {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                break;
            }
        }
    }

    public void start() {
        for (int i = 0; i < ships.length; i++) {
            ships[i].race();
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
