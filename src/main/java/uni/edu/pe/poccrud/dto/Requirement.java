package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Requirement {
    private int requirementId;
    private String requirementCode, requirementReason,requirementDescription;
}
