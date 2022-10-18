import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> pipes;

    public Pipe() {
        this.pipes = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipes.add(value);
    }

    public T takeFromPipe() {
        if (!this.pipes.isEmpty()) {
            T s = this.pipes.get(this.pipes.size() - 1);
            this.pipes.remove(this.pipes.size() - 1);
            return s;
        } else {
            return null;
        }
    }

    public boolean isInPipe() {
        return (this.pipes.isEmpty()) ? false : true;
    }
}
