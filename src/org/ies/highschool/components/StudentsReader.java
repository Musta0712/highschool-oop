package org.ies.highschool.components;

import org.ies.highschool.model.Students;

import java.util.Scanner;

public class StudentsReader {

    private final Scanner scanner;

    public StudentsReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Students read() {
        System.out.println("Introduce los siguientes datos");
        System.out.println("Nombre");
        String name = scanner.nextLine();
        System.out.println("Apellido");
        String surname = scanner.nextLine();
        System.out.println("Direccion");
        String address = scanner.nextLine();

        return new Students(
                name,
                surname,
                address
        );
    }

}
