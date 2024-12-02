public class Bird extends Pet implements Flies {
    private String breed;
    private String size; // small, medium, large, will eat the house!
    private String colour; // using various descriptions
    private byte wingSpan; // wing span in cms

    public Bird(String name, short age, String type, float price, float weight, boolean isFemale, String breed, String size, String colour, byte wingSpan) {
        super(name, age, type, price, weight, isFemale);
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.wingSpan = wingSpan;
    }

    public Bird(String name, short age, String type, float price, float weight, String breed, String size, String colour, byte wingSpan) {
        super(name, age, type, price, weight);
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.wingSpan = wingSpan;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public byte getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(byte wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    void makeNoise(){
        System.out.println("Chirp!");
    }

    public void sleep(){
        System.out.println("Rock back and forth!");
    }

    public void getFlightSpeed(){
        // do stuff
    }

    public void getFlightHeight(){
        // do stuff
    }
}
