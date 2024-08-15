package dio.padroes_projeto_spring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.padroes_projeto_spring.model.Cliente;
import dio.padroes_projeto_spring.model.Endereco;
import dio.padroes_projeto_spring.repo.ClienteRepo;
import dio.padroes_projeto_spring.repo.EnderecoRepo;
import dio.padroes_projeto_spring.service.ClienteService;
import dio.padroes_projeto_spring.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    // Singleton: injetar os componentes do Spring com @Autowired
    @Autowired
    private ClienteRepo clienteRepo;
    @Autowired
    private EnderecoRepo enderecoRepo;
    @Autowired
    private ViaCepService viaCepService;

    // Strategy: Implementar os metódos definidos na interface
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simple

    @Override
    public Iterable<Cliente> buscarTodos(){
        return clienteRepo.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepo.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Buscar cliente por ID
        Optional<Cliente> clienteBd = clienteRepo.findById(id);
        if(clienteBd.isPresent()){
            // Verificar se o endereço do cliente existe
            salvarClienteCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepo.deleteById(id);
    }

    private void salvarClienteCep(Cliente cliente){
        // Verificar se o endereço já existe (pelo CEP)
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepo.findById(cep).orElseGet(() -> {
            //Caso não exista, integrar com o viaCep
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepo.save(novoEndereco);
            return novoEndereco;
        });
        //Vinculo o endereco
        cliente.setEndereco(endereco);
        //Cadastro o novo cliente
        clienteRepo.save(cliente);
    }
}
