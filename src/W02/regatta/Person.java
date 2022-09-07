package W02.regatta;

public class Person {
    private String firstName;
    private String lastName;
    private String residence;

    public Person (String firstName, String lastName, String residence) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.residence = residence;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String firstName) {
        this.lastName = lastName;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String firstName) {
        this.residence = residence;
    }
}
