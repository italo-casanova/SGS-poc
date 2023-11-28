package uni.edu.pe.poccrud.dto

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class Application {
    private int clientId, applicationId;
    private String service, applicationDescription, applicationCode;
    private Date tentativeStartDate;
}
