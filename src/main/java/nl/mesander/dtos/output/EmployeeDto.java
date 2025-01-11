package nl.mesander.dtos.output;

// Imports
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
    private String name;
    private String function;
    private String company;

    // Changed from toHire to isHired
    private String isHired;
}
