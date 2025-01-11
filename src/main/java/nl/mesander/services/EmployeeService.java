package nl.mesander.services;

// Imports
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import nl.mesander.dtos.input.EmployeeInputDto;
import nl.mesander.dtos.output.EmployeeDto;

import java.io.File;

public class EmployeeService {

    // Transfer Methods
    public static EmployeeDto employeeToDto(EmployeeInputDto inputDto) {
        EmployeeDto employeeDto = new EmployeeDto();

        // CopyProperties helper method optional
        employeeDto.setName(inputDto.getName());
        employeeDto.setFunction(inputDto.getFunction());
        employeeDto.setCompany(inputDto.getCompany());

        // Changed variable
        employeeDto.setIsHired(inputDto.getToHire());

        return employeeDto;
    }

    // Methods
    public static EmployeeInputDto xmlToJava(String fileLocation) {
        try {
            // Create file to make method work for different files
            File xmlFile = new File(fileLocation);

            // Create a new inputDto class
            JAXBContext xmlContext = JAXBContext.newInstance(EmployeeInputDto.class);

            // Create Unmarshaller for converting XML to Java (Marshaller for java to xml)
            Unmarshaller unmarshaller = xmlContext.createUnmarshaller();

            // Execute unmarshaller, unmarshaller provides an object
            // unmarshaller creates an object so use explicit cast to 'transfer' object to EmployeeInputDto
            EmployeeInputDto employeeInputDto = (EmployeeInputDto) unmarshaller.unmarshal(xmlFile);

            return employeeInputDto;
        } catch (JAXBException error) {
            error.printStackTrace();
            return null;
        }
    }
}
