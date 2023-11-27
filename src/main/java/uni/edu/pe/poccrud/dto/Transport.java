package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Date;
@Data
@AllArgsConstructor

public class Transport {
    private int transportId;
    private String transportCode, transportMotive,transportTipo;
    private Date transportShipmentDate, transportDeliveryDate;
}
