public enum Education {
    PHD ("Doctoral degree"),
    MA ("Masters degree"),
    BA ("Bachelors degree"),
    HS ("High School diploma");

    private String degree;
    Education(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }
}
