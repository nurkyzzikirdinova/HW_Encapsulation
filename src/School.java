public class School {
    private String schoolName;
    private String schoolLocation;
    private int schoolFoundation;
    private String schoolDirector;

    public School() {
    }

    public School(String schoolName, String schoolLocation, int schoolFoundation, String schoolDirector) {
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
        this.schoolFoundation = schoolFoundation;
        this.schoolDirector = schoolDirector;
    }


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
    }

    public int getSchoolFoundation() {
        return schoolFoundation;
    }

    public void setSchoolFoundation(int schoolFoundation) {
        this.schoolFoundation = schoolFoundation;
    }

    public String getSchoolDirector() {
        return schoolDirector;
    }

    public void setSchoolDirector(String schoolDirector) {
        this.schoolDirector = schoolDirector;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolLocation='" + schoolLocation + '\'' +
                ", schoolFoundation=" + schoolFoundation +
                ", schoolDirector='" + schoolDirector + '\'' +
                '}';
    }
}

