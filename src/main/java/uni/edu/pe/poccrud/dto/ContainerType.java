package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContainerType {
    private int containerTypeId;
    private String containerTypeCode,containerTypeName;
}
