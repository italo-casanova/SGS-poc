package uni.edu.pe.poccrud.dto;

        import lombok.AllArgsConstructor;
        import lombok.Data;

@Data
@AllArgsConstructor
public class Container {
    private int containerID, disinfectionId, fumigationId, illuminationTypeId, containerTypeId;
    private String containerCode, destinationHarbour, shipmentHarbour, fillingPlace;
}