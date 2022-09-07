package W02.regatta;

import java.util.Random;

public class Ship {
    private int number;
    private String name;
    private int time;
    private Person owner;

    public Ship (int number, String name){
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void race() {
        Random random = new Random();
        this.time = random.nextInt(301)+300;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
