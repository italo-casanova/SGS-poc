package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class Training {
    private int trainingId, districtId;
    private Date beginningDate, endDate;
    private String trainingMotive, TrainingCode;
}
