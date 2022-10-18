import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Organism> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {
        for (Organism o : organisms) {
            o.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (Organism o : organisms) {
            s = s + o.toString() + "\n";
        }
        return s;
    }

    public void addToHerd(Movable movable) {
        if (movable instanceof Organism) {
            organisms.add((Organism) movable);
        }
    }
}
