package W07.optimizedgame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<Character> players = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean addPlayer = true;

        System.out.println("now you can add as many players as you want, to start type 'start'");
        System.out.println();

        /*for (int i = 0; addPlayer; i++) {
            System.out.printf("name from player %d%n", i + 1);
            String name = scanner.nextLine();

            if (name.equals("start")) {
                break;
            }

            Character player = new Character(name, 100, 25);
            players.add(player);

            System.out.println("");
        }*/

        Character player;

        player = new Character("player1", 100, 25);
        players.add(player);

        player = new Character("player2", 100, 25);
        player.setWeapon(new wButterflyKnife());
        players.add(player);

        player = new Character("player3", 100, 25);
        player.setWeapon(new wAK47());
        players.add(player);

        player = new Character("player4", 100, 25);
        player.setWeapon(new wAWP());
        players.add(player);

        System.out.println("\n--------------------\n");

        while (players.size() >= 2) {
            Random random = new Random();

            int index1 = random.nextInt(players.size());
            Character player1 = players.get(index1);

            int index2 = random.nextInt(players.size());

            while (index1 == index2) {
                index2 = random.nextInt(players.size());
            }

            Character player2 = players.get(index2);

            Fight fight = new Fight(player1, player2);
            fight.fight();
        }
    }
}
