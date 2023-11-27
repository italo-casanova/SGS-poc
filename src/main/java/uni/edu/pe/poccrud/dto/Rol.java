package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rol {
    private int rolId;
    private String rolName, rolDescription, rolCode;
}
