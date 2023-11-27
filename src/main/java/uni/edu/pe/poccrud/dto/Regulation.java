package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
@Data
@AllArgsConstructor
public class Regulation {
    private int regulationId;
    private String regulationCode,regulationType;
    private Date regulationDate;
}
