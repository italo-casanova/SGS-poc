package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Analysis {

    private int analysisId, sampleId, wareId;
    private String result, analysisCode;

}
