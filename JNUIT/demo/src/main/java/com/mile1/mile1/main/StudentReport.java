package com.mile1.main;

import com.mile1.bean.Student;

public class StudentReport {

    public String validate(Student s) {

        int total = 0;

        for (int mark : s.marks) {

            if (mark < 35) {
                return "F";
            }

            total += mark;
        }

        double average = total / s.marks.length;

        if (average >= 75) {
            return "A";
        } else if (average >= 50) {
            return "B";
        } else {
            return "D";
        }
    }
}