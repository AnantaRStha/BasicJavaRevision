import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> personList;

    public Employees() {
        this.personList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.personList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
//        peopleToAdd.stream().forEach(x->this.personList.add(x));
        Iterator<Person> iterator = peopleToAdd.iterator();
        while (iterator.hasNext()) {
            this.personList.add(iterator.next());
        }
    }

    public void print() {
//        this.personList.stream().forEach(x-> System.out.println(x));
        Iterator<Person> iterator = this.personList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.personList.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation().equals(education)) {
                System.out.println(p);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.personList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
