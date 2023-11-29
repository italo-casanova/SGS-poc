package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private String companyName, clientCode, clientMail, clientAddress, clientPassword, companyRepresentativeName,
            companyRepresentativeLastname, clientCellphone;
    private int clientId, clientRuc, companyRepresentativeDni;
}
