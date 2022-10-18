public class GradeDistribution {
    private Points points;
    private int gradeZero;
    private int gradeOne;
    private int gradeTwo;
    private int gradeThree;
    private int gradeFour;
    private int gradeFive;

    public GradeDistribution(Points points) {
        this.points = points;
        this.gradeOne = 0;
        this.gradeTwo = 0;
        this.gradeThree = 0;
        this.gradeFour = 0;
        this.gradeFive = 0;
    }

    public void distribution() {
        for (int p : points.getPointList()) {
            if (p >= 90) {
                this.gradeFive++;
            } else if (p < 90 && p >= 80) {
                this.gradeFour++;
            } else if (p < 80 && p >= 70) {
                this.gradeThree++;
            } else if (p < 70 && p >= 60) {
                this.gradeTwo++;
            } else if (p < 60 && p >= 50) {
                this.gradeOne++;
            } else {
                this.gradeZero++;
            }
        }
        System.out.println("Grade distribution: ");
        System.out.print("5: ");
        for (int i = 0; i < this.gradeFive; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        System.out.print("4: ");
        for (int i = 0; i < this.gradeFour; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        System.out.print("3: ");
        for (int i = 0; i < this.gradeThree; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        System.out.print("2: ");
        for (int i = 0; i < this.gradeTwo; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        System.out.print("1: ");
        for (int i = 0; i < this.gradeOne; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        System.out.print("0: ");
        for (int i = 0; i < this.gradeZero; i++) {
            System.out.print("*");
        }
    }
}
