package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dispatch {

    private int dispatchId, dispatchWeight, transportId;
    private String dispatchCode, tractorPlate, cartPlate, firstRevisionState, secondRevisionState, observation,
            shipmentPort, customAgent, ship;
}
