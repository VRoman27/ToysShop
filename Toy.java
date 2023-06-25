import java.util.concurrent.atomic.AtomicInteger;

public class Toy {
    static int counter = 0;
    private int id;
    private float chance;
    private String name;

    Toy(String name, float chance){
        this.id = ++counter;
        this.chance = chance;
        this.name = name;
    }

    int GetId(){ return this.id; }
    float GetChance(){ return this.chance;}
    String GetName(){ return this.name;}

    @Override
    public String toString() {
        return this.id + ": " + this.name + " |" + this.chance;
    }
}
