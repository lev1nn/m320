package W03.regatta;

public class Start {
    static Competition competition = new Competition("Rotsee Regatta");

    public static void main(String[] args) {
        Person owner = new Person("Levin", "Schaller", "Münchenstein");

        Ship ship1 = new Ship(1, "Alinghi");
        Ship ship2 = new Ship(2, "Red Baron");
        Ship ship3 = new Ship(3, "Blue Lagoon");

        ship1.setOwner(owner);
        ship2.setOwner(owner);
        ship3.setOwner(owner);

        competition.addShip(ship1); //add ships to competition
        competition.addShip(ship2);
        competition.addShip(ship3);

        competition.start(); //start competition

        competition.printResult(); //print ships with time
    }
}
