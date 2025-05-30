import java.util.*;
class StudentComparator implements Comparator<Student> {

    // Overriding compare()method of Comparator
    // for descending order of cgpa
    public int compare(Student s1, Student s2) {
        if (s1.cgpa < s2.cgpa) {
            return 1; 
        }else if (s1.cgpa > s2.cgpa) {
            return -1;
        }
        return 0;
    }
}
