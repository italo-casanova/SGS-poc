package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class ClientForm {
    private String companyName, companyRuc, clientCode;
}
