public class Author {

    private String name;
    private String address;
    private int phonenumber;

    // whenever this method is called, with the inputs, it will make one of the authors with the assigned variables.
    public Author(String name, String address, int phonenumber) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    // Getters for the variables
    public String GetName() {
        return this.name();
    }

    public String GetAddress() {
        return this.address();
    }

    public int GetPhoneNumber() {
        return this.phonenumber();
    }

    // Setters for the variables
    public String SetName(String name) {
        return this.name() = name;
    }

    public String SetAddress(int phonenumber) {
        return this.address() = phonenumber;
    }

    public int SetPhoneNumber(String address) {
        return this.phonenumber() = address;
    }
}
