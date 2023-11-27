package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class Worker {
    private int workerId, rolId, SupervisorId;
    private String workerName, workerCode, supervisorCode;
    private Date entryDate;
}
