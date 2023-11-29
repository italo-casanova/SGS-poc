package uni.edu.pe.poccrud.service;

import uni.edu.pe.poccrud.dto.Client;

public interface ClientService {

    int addClient(Client client);
    int addClientInspection(Client client);

    int updateClient(Client client, int id);
}
