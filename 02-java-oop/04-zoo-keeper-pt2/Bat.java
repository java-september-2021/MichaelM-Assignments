

public class Bat extends Mammal {
    public Bat(){
        super(300);
    }

    public void fly(){
        System.out.println("The bat takes off.. swooosh");
        this.energyLevel -= 50;
    }

    public void attackTown(){
        System.out.println("The bat is attacking the town.");
        this.energyLevel -= 100;
    }

    public void eatHumans(){
        System.out.println("The bat has nibbled a human!! nom nom");
        this.energyLevel += 25;
    }

}
