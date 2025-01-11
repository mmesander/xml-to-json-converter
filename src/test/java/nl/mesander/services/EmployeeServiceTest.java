package nl.mesander.services;

// Imports
import nl.mesander.dtos.input.EmployeeInputDto;
import nl.mesander.dtos.output.EmployeeDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    EmployeeInputDto mockEmployeeInputDto;
    EmployeeDto mockEmployeeDto;
    String testFileLocation;
    String mockJsonString;

    @BeforeEach
    void init() {
        mockEmployeeInputDto = new EmployeeInputDto();
        mockEmployeeInputDto.setName("Mark Test");
        mockEmployeeInputDto.setFunction("Junior Java Developer Test");
        mockEmployeeInputDto.setCompany("Copernicus Test");
        mockEmployeeInputDto.setToHire("Absolutely");

        testFileLocation = "src/test/resources/EmployeeTest.xml";

        mockJsonString = "{\"name\":\"Mark Super Test\",\"function\":\"Medior Java Developer Test\",\"company\":\"Copernicus Super Test\",\"isHired\":\"100% Yes\"}";

        mockEmployeeDto = new EmployeeDto();
        mockEmployeeDto.setName("Mark Super Test");
        mockEmployeeDto.setFunction("Medior Java Developer Test");
        mockEmployeeDto.setCompany("Copernicus Super Test");
        mockEmployeeDto.setIsHired("100% Yes");
    }

    @AfterEach
    void tearDown() {
        mockEmployeeInputDto = null;
        mockEmployeeDto = null;
        testFileLocation = "";
        mockJsonString = "";
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
    @DisplayName("Should transfer XML file to EmployeeInputDto")
    void xmlToJava() {
        // Arrange
        // BeforeEach init String: testFileLocation

        // Act
        EmployeeInputDto result = EmployeeService.xmlToJava(testFileLocation);

        // Assert
        assertEquals("Mark Mesander Test", result.getName());
        assertEquals("Junior Java Developer Test", result.getFunction());
        assertEquals("Copernicus Test", result.getCompany());
        assertEquals("Absolutely", result.getToHire());
    }

    @Test
    @DisplayName("Should transfer EmployeeDto to JsonString")
    void javaToJson() {
        // Arrange
        // BeforeEach init EmployeeDto: mockEmployeeDto
        // BeforeEach init String: mockJsonString

        // Act
        String result = EmployeeService.javaToJson(mockEmployeeDto);

        // Assert
        assertEquals(mockJsonString, result);

    }
}