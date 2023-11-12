package uni.edu.pe.poccrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.poccrud.dto.Client;
import uni.edu.pe.poccrud.service.ClientService;

@RestController
@CrossOrigin("*")
public class ClientController {

    @Autowired
    ClientService service;

    @RequestMapping(
            value = "/api/v1/clients",
            method = RequestMethod.POST
    )
    public Client addClient(
            @RequestBody Client client
            ) {
        service.addClient(client);
        return client;
    }
}
