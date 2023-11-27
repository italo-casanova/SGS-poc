package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RevisionType {
    private int revisiontypeId;
    private String revisiontypeCode, revisiontypeDescription;
}
