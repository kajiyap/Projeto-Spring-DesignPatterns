package dio.padroes_projeto_spring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dio.padroes_projeto_spring.model.Endereco;

/* Cliente HTTP, criado com OpenFeign, para consumo da API do ViaCEP */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);    
}