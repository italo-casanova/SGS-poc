package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Zone {
    private int zoneId;
    private String zoneCode, zoneName;
}
