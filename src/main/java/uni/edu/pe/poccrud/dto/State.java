package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class State {
    private int stateId;
    private String stateCode;
    private String stateName;
}
