package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ToolType {
    private int tooltypeId;
    private String tooltypeCode, tooltypeName,tooltypeDescription;
}
