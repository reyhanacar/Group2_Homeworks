package day24;

import java.util.Arrays;

public class Students {
    String firstname;
    String Lastname;
    int ages;
    int[] grades;

    public Students(String firstName, String lastName, int age, int[] grades) {
        this.firstname = firstName;
        this.Lastname = lastName;
        this.ages = age;
        this.grades = grades;
    }


    public void showinfo() {
        System.out.printf("%s %s [%d] %s", firstname, Lastname, ages, Arrays.toString(grades));
    }

        double getGPA() {
            int sum=0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) Math.round((double)sum/grades.length);
        }
    }









