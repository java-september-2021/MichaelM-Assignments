public class Mammal{
    protected int energyLevel;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println("Mammal's Energy Level is " + energyLevel);
        return this.energyLevel;
    }
}