import java.time.LocalDate;

/**University, School деген класс тузунуз
 Алардын свойстваларын ойлоп табыныз
 Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
 Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
 Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз*/
public class Main {

    public static void main(String[] args) {
 Person [] persons = new Person[3];
 persons[0]= new Person();
 persons[1]= new Person();
 persons[2]= new Person();

persons[0].setPersonName("Nurkyz");
persons[0].setPersonSurname("Zikirdinova");
persons[0].setPersonPosition("Java");

persons[1].setPersonName("Nurkyz");
persons[1].setPersonSurname("Zikirdinova");
persons[1].setPersonPosition("JS");

persons[2].setPersonName("Nurkyz");
persons[2].setPersonSurname("Zikirdinova");
persons[2].setPersonPosition("Java");

for(Person person : persons){
//    System.out.println(person);

    System.out.println("Name: --> "+person.getPersonName()+"   Surname:--> "+person.getPersonSurname()+"  Position--> "+person.getPersonPosition());

}
        System.out.println();

        Car[] cars = new Car[3];
        cars[0] = new Car();
        cars[1] = new Car();
        cars[2] = new Car();

        cars[0].setCarBrand("Ford");
        cars[0].setCarModel("Camry");
        cars[0].setCarColor("White");
        cars[0].setCarPrice(20000);

        cars[1].setCarBrand("Kia ");
        cars[1].setCarModel("Pica ");
        cars[1].setCarColor("Red  ");
        cars[1].setCarPrice(25000);

        cars[2].setCarBrand("BMW ");
        cars[2].setCarModel("X3   ");
        cars[2].setCarColor("Black");
        cars[2].setCarPrice(40000);


        for (Car car : cars) {
            //System.out.println(car);
            System.out.println("Brand:--> " + car.getCarBrand() + "  Model:-->  " + car.getCarModel() +" Color:-->  "+ car.getCarColor()+ "  Price:--> " + car.getCarPrice()+"$");
        }
        System.out.println();


        School [] schools = new School[3];
        schools[0] = new School();
        schools[1] = new School();
        schools[2] = new School();

        schools[0].setSchoolName("Light");
        schools[0].setSchoolDirector("Nurkyz Zikirdinova");
        schools[0].setSchoolLocation("Tokombayev 123");
        schools[0].setSchoolFoundation(1991);

        schools[1].setSchoolName("Sunss");
        schools[1].setSchoolDirector("Nurkyz Zikirdinova");
        schools[1].setSchoolLocation("Aliyev 197");
        schools[1].setSchoolFoundation(1992);

        schools[2].setSchoolName("Light");
        schools[2].setSchoolDirector("Nurkyz Zikirdinova");
        schools[2].setSchoolLocation("Ahunbayev 132");
        schools[2].setSchoolFoundation(1999);

        for(School school: schools){
//            System.out.println(school);
            System.out.println("School name:-->  "+school.getSchoolName()+"  School director:--> "+school.getSchoolDirector()+"  School location:--> "+school.getSchoolLocation()+"  Foundation year:--> "+school.getSchoolFoundation());
        }

        System.out.println();


        University[] universities = new University[3];
        universities[0]= new University();
        universities[1]= new University();
        universities[2]= new University();


        universities[0].setUniversityName("IUA");
        universities[0].setRanking("100");
        universities[0].setStudentQuantity(55000);
        universities[0].setDateOfFoundation(LocalDate.of(1995,2 ,3));


        universities[1].setUniversityName("UCA");
        universities[1].setRanking("100");
        universities[1].setStudentQuantity(50000);
        universities[1].setDateOfFoundation(LocalDate.of(1998,4 ,4));


        universities[2].setUniversityName("ITU");
        universities[2].setRanking("100");
        universities[2].setStudentQuantity(45000);
        universities[2].setDateOfFoundation(LocalDate.of(1999,8 ,23));


        for (University university : universities){
            //System.out.println(university);
            System.out.println("University of:-->  " +university.getUniversityName()+"  Ranking:-->"+ university.getRanking()+"  Quantity of student:--> "+university.getStudentQuantity()+" Foundation:--> "+university.getDateOfFoundation());
        }

    }
    }



