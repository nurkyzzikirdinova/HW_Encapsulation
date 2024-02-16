import java.time.LocalDate;

public class University {
    private String universityName;
    private String ranking;
    private long studentQuantity;
    private LocalDate dateOfFoundation;

    public University() {
    }

    public University(String universityName, String ranking, long studentQuantity, LocalDate dateOfFoundation) {
        this.universityName = universityName;
        this.ranking = ranking;
        this.studentQuantity = studentQuantity;
        this.dateOfFoundation = dateOfFoundation;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public long getStudentQuantity() {
        return studentQuantity;
    }

    public void setStudentQuantity(long studentQuantity) {
        this.studentQuantity = studentQuantity;
    }

    public LocalDate getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(LocalDate dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", ranking='" + ranking + '\'' +
                ", studentQuantity=" + studentQuantity +
                ", dateOfFoundation=" + dateOfFoundation +
                '}';
    }
}
