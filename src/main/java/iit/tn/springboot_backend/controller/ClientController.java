package iit.tn.springboot_backend.controller;

import iit.tn.springboot_backend.entity.Client;
import iit.tn.springboot_backend.repository.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
