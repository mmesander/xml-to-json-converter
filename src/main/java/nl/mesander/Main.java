package nl.mesander;

import nl.mesander.dtos.input.EmployeeInputDto;

import static nl.mesander.services.EmployeeService.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String fileLocation = "src/main/resources/Employee.xml";
        EmployeeInputDto employeeInputDto = xmlToJava(fileLocation);
        System.out.println(employeeInputDto.getName());
        System.out.println(employeeInputDto.getFunction());
        System.out.println(employeeInputDto.getCompany());
        System.out.println(employeeInputDto.getToHire());
    }
}