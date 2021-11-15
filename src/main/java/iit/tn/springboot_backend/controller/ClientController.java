package iit.tn.springboot_backend.controller;

import iit.tn.springboot_backend.entity.Client;
import iit.tn.springboot_backend.repository.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class ClientController {
    @Autowired
    private ClientDAO clientDAO;

    // get all client

    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return clientDAO.findAll();
    }

    // create client rest api
    @PostMapping("/clients")
    public Client createClient(@RequestBody Client client){
        return clientDAO.save(client);
    }
}
