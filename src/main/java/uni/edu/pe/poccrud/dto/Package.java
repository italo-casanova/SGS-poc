package uni.edu.pe.poccrud.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Package {
    private int packageId, transportId, vehiclesAmount;
    private String packageCode, shipmentAddress;
}
