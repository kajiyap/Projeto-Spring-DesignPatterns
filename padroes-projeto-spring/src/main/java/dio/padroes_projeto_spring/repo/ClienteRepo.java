package dio.padroes_projeto_spring.repo;

import org.springframework.data.repository.CrudRepository;
import dio.padroes_projeto_spring.model.Cliente;

public interface ClienteRepo extends CrudRepository<Cliente, Long> {
}
