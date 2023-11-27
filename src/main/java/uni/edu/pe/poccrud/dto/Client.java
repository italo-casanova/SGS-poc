package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private String companyName, company, clientMail, clientRuc, clientDni, clientCellphone, clientAddress,
            clientPassword ;

}
