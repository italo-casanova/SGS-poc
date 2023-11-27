package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class Discharge {
    private int dischargeId, workerId;
    private Date dischargeDate;
    private String dischargeMotive, dischargeCode;
}
