package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Surface {
    private int surfaceId;
    private String surfaceCode, surfaceName;
}
