package com.mile1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.main.StudentService;

public class StudentTest {

    StudentService service;

    @Before
    public void setUp() {
        service = new StudentService();
    }

    // Test Case 1
    @Test
    public void testGradeA() throws Exception {
        Student s = new Student("Keerthi", new int[]{90, 85, 95});
        assertEquals("A", service.findGrades(s));
    }

    // Test Case 2
    @Test
    public void testGradeB() throws Exception {
        Student s = new Student("Navya", new int[]{60, 55, 50});
        assertEquals("B", service.findGrades(s));
    }

    // Test Case 3
    @Test
    public void testGradeD() throws Exception {
        Student s = new Student("Rahul", new int[]{40, 42, 45});
        assertEquals("D", service.findGrades(s));
    }

    // Test Case 4
    @Test
    public void testGradeF() throws Exception {
        Student s = new Student("Anil", new int[]{80, 30, 90});
        assertEquals("F", service.findGrades(s));
    }

    // Test Case 5
    @Test(expected = NullStudentException.class)
    public void testNullStudent() throws Exception {
        service.findGrades(null);
    }

    // Test Case 6
    @Test(expected = NullNameException.class)
    public void testNullName() throws Exception {
        Student s = new Student(null, new int[]{70, 80, 90});
        service.findGrades(s);
    }

    // Test Case 7
    @Test(expected = NullMarksArrayException.class)
    public void testNullMarks() throws Exception {
        Student s = new Student("Keerthi", null);
        service.findGrades(s);
    }

    // Test Case 8
    @Test
    public void testNullStudentCount() {
        Student[] students = {
                new Student("A", new int[]{80}),
                null,
                new Student("B", new int[]{60}),
                null
        };

        assertEquals(2, service.findNumberOfNullStudents(students));
    }

    // Test Case 9
    @Test
    public void testNullNameAndMarksCount() {

        Student s1 = new Student(null, new int[]{80});
        Student s2 = new Student("B", null);
        Student s3 = new Student("C", new int[]{90});

        Student[] students = {s1, s2, s3};

        assertEquals(1, service.findNumberOfNullNames(students));
        assertEquals(1, service.findNumberOfNullMarksArray(students));
    }
}