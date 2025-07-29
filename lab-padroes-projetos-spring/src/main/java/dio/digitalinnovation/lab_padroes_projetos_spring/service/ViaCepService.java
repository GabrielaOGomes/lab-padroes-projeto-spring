package dio.digitalinnovation.lab_padroes_projetos_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dio.digitalinnovation.lab_padroes_projetos_spring.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @Autowired
    @GetMapping("/{cep}/json")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
