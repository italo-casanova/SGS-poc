package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
@Data
@AllArgsConstructor

public class Modification {
    private int modificationId;
    private String modificationCode,modificationReason;
    private Date modificationDate;

}
