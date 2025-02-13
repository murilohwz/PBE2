import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriasjoiasjoia.app.entities.Cliente;
import br.com.joalheriasjoiasjoia.app.repositories.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteControllers {
    
    @Autowired
    private ClienteService clienteService;
    
    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }
    
    @GetMapping
    public List<Cliente> getAllCliente(){
        return clienteService.getAllCliente();
    }
    
    @DeleteMapping("{id")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }
    
    
    
    
}
@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepostory;
    
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepostory.save(cliente);
    }
    
    public List<Cliente> getAllCliente(){
        return clienteRepostory.findAll();
    }
    
    public Cliente getClienteById (Long id) {
        return clienteRepostory.findById(id).orElse(null);
    }
    
    public void deleteCliente(Long id) {
        clienteRepostory.deleteById(id);
    }
}

