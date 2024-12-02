public abstract class Pet {
    private String name;
    private short age;
    private String type;
    private float price; // pounds and pence
    private float weight; // kg
    private boolean isFemale;

    public Pet(String name, short age, String type, float price, float weight, boolean isFemale) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.isFemale = isFemale;
    }

    public Pet(String name, short age, String type, float price, float weight) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    void eat(){
        System.out.println("Nom nom nom!");
    }

    void makeNoise(){
        System.out.println("I have no idea at this time!");
    }

   public abstract void sleep();

}
