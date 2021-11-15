package iit.tn.springboot_backend.controller;

import iit.tn.springboot_backend.entity.Client;
import iit.tn.springboot_backend.exception.ResourceNotFoundException;
import iit.tn.springboot_backend.repository.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    // get client by id rest api
    @GetMapping("/clients/{id}")
    public ResponseEntity <Client> getClientById(@PathVariable Long id){
        Client client = clientDAO.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Client not exist with id :"+ id));
        return ResponseEntity.ok(client);
    }

}
