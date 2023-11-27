package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private String companyName, company, clientMail, clientRuc, companyRepresentativeDni, clientCellphone, clientAddress,
            clientPassword, companyRepresentativeName, companyRepresentativeLastname;

}
