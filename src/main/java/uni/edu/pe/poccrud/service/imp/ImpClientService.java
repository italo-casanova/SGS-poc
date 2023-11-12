package uni.edu.pe.poccrud.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.poccrud.dao.ClientDao;
import uni.edu.pe.poccrud.dto.Client;
import uni.edu.pe.poccrud.service.ClientService;

@Service
public class ImpClientService implements ClientService {

    @Autowired
    ClientDao dao;

    @Override
    public int addClient(Client client) {
        return dao.addClient(client);
    }

    @Override
    public int updateClient(Client client, int id) {
        return 0;
    }
}
