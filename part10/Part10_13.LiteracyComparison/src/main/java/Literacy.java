public class Literacy implements Comparable<Literacy>{
    private String name;
    private int year;
    private String gender;
    private double number;

    public Literacy(String name, int year, String gender, double number) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.name +" (" + this.year + "), "+this.gender +", "+this.number;
    }

    @Override
    public int compareTo(Literacy o) {
        return (int) (o.getNumber()- this.getNumber());
    }
}
