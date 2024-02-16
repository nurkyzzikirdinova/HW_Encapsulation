public class Person {
    private String personName;
    private String personSurname;
    private int personAge;
    private String personPosition;

    public String getPersonName(){
        return personName;
    }
    public String getPersonSurname(){
        return personSurname;
    }
    public int getPersonAge(){
        return personAge;
    }

    public String getPersonPosition() {
        return personPosition;
    }
    public void setPersonName(String personName) {
        this.personName=personName;

    }
    public void setPersonSurname(String personSurname) {
        this.personSurname=personSurname;

    }
    public void setPersonAge(int personAge) {
        this.personAge=personAge;

    }
    public void setPersonPosition(String personPosition) {
        this.personPosition=personPosition;

    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                ", personAge=" + personAge +
                ", personPosition='" + personPosition + '\'' +
                '}';

    }
}


