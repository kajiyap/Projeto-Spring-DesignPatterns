package dio.padroes_projeto_spring.repo;

import org.springframework.data.repository.CrudRepository;
import dio.padroes_projeto_spring.model.Endereco;

public interface EnderecoRepo extends CrudRepository<Endereco, String>{
}
