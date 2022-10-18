import java.util.ArrayList;

public class BirdWatch {
    private ArrayList<Bird> birds;

    public BirdWatch() {
        this.birds = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        this.birds.add(bird);
    }

    public void observation(String name) {
        if (this.birds.stream().anyMatch(s -> s.getName().equals(name))) {
            for (Bird b : this.birds) {
                if (b.getName().equals(name)) {
                    b.observationCount();
                }
            }
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void all() {
        if (!this.birds.isEmpty()) {
            for (Bird b : this.birds) {
                System.out.println(b.getName() + "(" + b.getLatinName() + "): " + b.getCount() + " observations");
            }
        }
    }

    public void one(String name) {
        if (!this.birds.isEmpty()) {
            if (this.birds.stream().anyMatch(s -> s.getName().equals(name))) {
                for (Bird b : this.birds) {
                    if (b.getName().equals(name)) {
                        System.out.println(b.getName() + "(" + b.getLatinName() + "): " + b.getCount() + " observations");

                    }
                }
            }
        }
    }

}
