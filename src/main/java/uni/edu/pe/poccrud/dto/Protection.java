package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class Protection {
    private int protectionId;
    private String protectionCod, protectionName;
}
