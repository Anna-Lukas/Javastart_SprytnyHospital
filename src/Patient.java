public class Patient {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Patient() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    private String firstName;
    private String lastName;
    private String pesel;

}

