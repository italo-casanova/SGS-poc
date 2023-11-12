package uni.edu.pe.poccrud.dao;
import uni.edu.pe.poccrud.dto.Client;


public interface ClientDao {
    int addClient(Client client);
    int updateClient(Client client, int id);

}
