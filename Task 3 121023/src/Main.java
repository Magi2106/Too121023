import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> student1PassedCourses = new ArrayList<>();
        student1PassedCourses.add("Java 1.0");
        ArrayList<String> student1CurrentCourses = new ArrayList<>();
        Student student1 = new Student("Gustav", student1PassedCourses, student1CurrentCourses);
        persons.add(student1);

        ArrayList<String> student2PassedCourses = new ArrayList<>();
        student2PassedCourses.add("relgion");
        ArrayList<String> student2CurrentCourses = new ArrayList<>();
        Student student2 = new Student("Magnus", student2PassedCourses, student2CurrentCourses);
        persons.add(student2);

        ArrayList<String> teacher1CanTeach = new ArrayList<>();
        teacher1CanTeach.add("Java 1.0");
        ArrayList<String> teacher1CurrentCourses = new ArrayList<>();
        Teacher teacher1 = new Teacher("Jesus", teacher1CanTeach, teacher1CurrentCourses);
        persons.add(teacher1);

        ArrayList<String> teacher2CanTeach = new ArrayList<>();
        teacher2CanTeach.add("relgion");
        ArrayList<String> teacher2CurrentCourses = new ArrayList<>();
        Teacher teacher2 = new Teacher("Jesis", teacher2CanTeach, teacher2CurrentCourses);
        persons.add(teacher2);

        for (Person person : persons) {
            if (!person.addCourse("Java 1.0")) {
                System.out.print(person.getName());
                if (person instanceof Student) {
                    System.out.println(" has already passed this course.");
                } else if (person instanceof Teacher) {
                    System.out.println(" cannot teach this course.");
                }
            }
        }
    }
}

//Fodnote, min første version af programmet var ekstremt dumt, og havde problemer når jeg ændrede værdier derfor har jeg opdateret programmet med hjælpemiddler.