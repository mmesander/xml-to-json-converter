package nl.mesander.services;

import nl.mesander.dtos.input.EmployeeInputDto;
import nl.mesander.dtos.output.EmployeeDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    private EmployeeService employeeService;

    EmployeeInputDto mockEmployeeInputDto;

    @BeforeEach
    void init() {
        mockEmployeeInputDto = new EmployeeInputDto();
        mockEmployeeInputDto.setName("Mark Test");
        mockEmployeeInputDto.setFunction("Java Developer Test");
        mockEmployeeInputDto.setCompany("Copernicus Test");
        mockEmployeeInputDto.setToHire("Absolutely");
    }

    @AfterEach
    void tearDown() {
        mockEmployeeInputDto = null;
    }

    @Test
    @DisplayName("Should transfer EmployeeInputDto to EmployeeDto")
    void employeeToDto() {
        // Arrange
        // BeforeEach init EmployeeInputDto: mockEmployeeInputDto

        // Act
        EmployeeDto result = EmployeeService.employeeToDto(mockEmployeeInputDto);

        // Assert
        assertEquals(mockEmployeeInputDto.getName(), result.getName());
        assertEquals(mockEmployeeInputDto.getFunction(), result.getFunction());
        assertEquals(mockEmployeeInputDto.getCompany(), result.getCompany());
        assertEquals(mockEmployeeInputDto.getToHire(), result.getIsHired());
    }

    @Test
    void xmlToJava() {
        // Arrange

        // Act

        // Assert

    }

    @Test
    void javaToJson() {
        // Arrange

        // Act

        // Assert

    }
}