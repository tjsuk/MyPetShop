public class Dog extends Pet implements IRuns,ISwim{
    private String breed;
    private String size; // small, medium, large, will eat the house!
    private String colour; // using various descriptions
    private String proficiency; // Whether it could be a service dog and what it is
    private boolean isLongHaired;

    public Dog(String name, short age, float price, float weight, boolean isFemale, String breed, String size, String colour, String proficiency, boolean isLongHaired) {
        super(name, age, "Dog", price, weight, isFemale);
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.proficiency = proficiency;
        this.isLongHaired = isLongHaired;
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

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public boolean isLongHaired() {
        return isLongHaired;
    }

    public void setLongHaired(boolean longHaired) {
        isLongHaired = longHaired;
    }

    @Override
    void makeNoise(){
        System.out.println("Woof!");
    }

    public void sleep(){
        System.out.println("Twitch and snore!");
    }

    @Override
    public void swim() {
        // Do stuff
    }

    @Override
    public float getDepth() {
        return 0;
    }

    @Override
    public byte getSpeed() {
        return 0;
    }
}
