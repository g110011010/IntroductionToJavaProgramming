package Chapter10;

import java.util.Arrays;

/**
 * Created by sf on 2017/8/22.
 */
public class Course {
    private String courseName;
    private String[] students=new String[100];
    private int numberOfStudents;
    public Course(String courseName){
        this.courseName=courseName;
    }
    public void addStudents(String student){
        this.students[numberOfStudents++]=student;
    }
    public void dropStudent(String student){
        for(int i=0;i<this.students.length&&students[i]!=null;i++){
            if(student==students[i]){
                students[i]=null;
                for(int j=i;j<students.length&&students[j]!=null;j++){
                    students[j]=students[j+1];
                }
                numberOfStudents--;
                break;
            }
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
