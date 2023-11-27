package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Department {
    private int DepartmentId;
    private String DepartmentCode, DepartmentName;
}
