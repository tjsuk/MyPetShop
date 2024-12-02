public class Goldfish extends Pet implements ISwim {
    private String colour = "Orange"; // using various descriptions

    public Goldfish(String name, short age, String type, float price, float weight, String colour) {
        super(name, age, type, price, weight);
        this.colour = colour;
    }

    public Goldfish(String name, short age, String type, float price, float weight) {
        super(name, age, type, price, weight);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    void makeNoise(){
        System.out.println("Chirp!");
    }

    public void sleep(){
        System.out.println("Rock back and forth!");
    }

    @Override
    public void swim() {
        // do stuff
    }

    @Override
    public float getDepth() {
        return 0;
    }
}
