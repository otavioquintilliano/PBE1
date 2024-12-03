
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senaidev.loja.entities.Cliente;
import br.com.senaidev.loja.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Listar todos os clientes
    public List<Cliente> buscarClientes() {
        return clienteRepository.findAll();
    }

    // Buscar cliente por ID
    public Cliente buscarClientesPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
    
    //Buca cliente por cpf
    public Cliente buscarClientePor(String) {
    	return clienteRepository.findBy();
    }

    // Salvar cliente
    public Cliente criarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Deletar cliente
    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
