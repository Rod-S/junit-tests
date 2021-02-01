import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public int addGrade(int grade){
        grades.add(0);
        return grade;
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double gradesListTotal = 0.0;
        for (int i = 0; i < grades.size(); i++) {
            gradesListTotal += grades.get(i);
        }
        return gradesListTotal;
    }
}
