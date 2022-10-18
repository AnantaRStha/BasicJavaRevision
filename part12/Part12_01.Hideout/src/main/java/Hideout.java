import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
    private List<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (!this.hideout.contains(toHide)) {
            this.hideout.add(toHide);
        }
    }

    public T takeFromHideout() {
        if (!this.hideout.isEmpty()) {
            T s = this.hideout.get(this.hideout.size() - 1);
//            this.hideout.remove(this.hideout.size() - 1);
            this.hideout.clear();
            return s;
        } else {
            return null;
        }
    }

    public boolean isInHideout() {
        return (this.hideout.isEmpty()) ? false : true;
    }
}
