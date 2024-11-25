package org.ies.highschool;

import org.ies.highschool.components.StudentsReader;
import org.ies.highschool.model.Students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentsReader studentsReader = new StudentsReader(scanner);
        Students students = studentsReader.read();

        students.showInfo();
    }
}