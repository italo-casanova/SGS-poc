package uni.edu.pe.poccrud.dao;
import uni.edu.pe.poccrud.dto.Client;
import uni.edu.pe.poccrud.dto.ClientForm;


public interface ClientDao {
    int addClient(Client client);
    int addClientInspection(Client client);
    ClientForm getClientForInspection(int ruc);
    int updateClient(Client client, int id);

}
