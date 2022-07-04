import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StudentTest {

@Test
    void toStringTest(){
    String name = "Amir";
    int age = 26;
    String city = "Hamburg";

    Student s2 = new Student(name, age, city);

    String actual = s2.toString();

    String expected = "Amir 26 Hamburg";

    Assertions.assertEquals(actual,expected);

}

}
