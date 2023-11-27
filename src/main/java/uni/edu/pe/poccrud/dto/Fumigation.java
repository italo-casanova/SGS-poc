package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
@Data
@AllArgsConstructor
public class Fumigation {
    private int fumigationId, pillDose, pillQuantity;
    private String fumigationCode, pillBranch;
    private Date fumigationDate, expirationDate;

}
