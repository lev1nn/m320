package W04.javadoc;

/**
 * class is to create ships (objects)
 * class contains a constructor and getter & setter methods
 */
public class Ship {

    private int nr;
    private String name;
    private int time;

    public Ship(int nr, String name) {
        this.nr = nr;
        this.name = name;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * the method @see race() generates a random time between 300 and 600
     */
    public void race() {
        int min = 300;
        int max = 600;
        this.time = (int) (Math.random() * (max - min + 1)) + min;
    }

    public int getTime() {
        return time;
    }

}
