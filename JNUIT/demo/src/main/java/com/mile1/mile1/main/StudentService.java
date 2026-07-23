package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentService {

    StudentReport report = new StudentReport();

    public String findGrades(Student student)
            throws NullStudentException, NullNameException, NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.name == null)
            throw new NullNameException();

        if (student.marks == null)
            throw new NullMarksArrayException();

        return report.validate(student);
    }

    public int findNumberOfNullStudents(Student[] students) {

        int count = 0;

        for (Student s : students) {

            if (s == null)
                count++;
        }

        return count;
    }

    public int findNumberOfNullNames(Student[] students) {

        int count = 0;

        for (Student s : students) {

            if (s != null && s.name == null)
                count++;
        }

        return count;
    }

    public int findNumberOfNullMarksArray(Student[] students) {

        int count = 0;

        for (Student s : students) {

            if (s != null && s.marks == null)
                count++;
        }

        return count;
    }
}