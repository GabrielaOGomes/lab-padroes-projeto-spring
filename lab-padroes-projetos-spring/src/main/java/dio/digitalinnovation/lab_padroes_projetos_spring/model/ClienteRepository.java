package dio.digitalinnovation.lab_padroes_projetos_spring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
