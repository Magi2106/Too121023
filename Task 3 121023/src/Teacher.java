import java.util.ArrayList;
class Teacher extends Person {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach, ArrayList<String> currentCourses) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course) && !currentCourses.contains(course)) {
            currentCourses.add(course);
            return true;
        }
        return false;
    }
}
