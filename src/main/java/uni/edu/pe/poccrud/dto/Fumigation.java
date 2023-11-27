package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
@Data
@AllArgsConstructor
public class Fumigation {
    private int fumigationId;
    private String fumigationCode;
    private Date fumigationDate;
    private String pillBranch;
    private int pillDose;
    private int pillQuantity;
    private Date expirationDate;

}
