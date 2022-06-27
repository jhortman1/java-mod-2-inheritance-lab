public class Main {
    public static void main(String[] args) {
        System.out.println("Running Pokemon Examples...");
        
        Pokemon pikachu = new Pokemon("Pikachu");
        pikachu.sayHi();
        pikachu.attack();

        FireType charzard = new FireType("Charzard", 50);
        charzard.sayHi();
        charzard.attack();

        WaterType blastoise = new WaterType("Blastoise", 75);
        blastoise.sayHi();
        blastoise.attack();
    }
}
