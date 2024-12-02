public class Program {
    public static void main(String[] args) {
        // Pet p = new Pet("Fred",(short)1,"Cat",15.00f,0.5f,false);
        // System.out.println("Name: " + p.getName());

        Dog d = new Dog("Lollie",(short)8,250.00f,20.00f,true,
                "Border Collie","Medium","Black and White",
                "No Proficiency",true);
        System.out.println("Name: " + d.getName());
        System.out.println("Type: " + d.getType());
        d.makeNoise();


    }
}
