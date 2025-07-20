package com.extremebike.agendadortarefas.Infrastructure.repository;
import com.extremebike.agendadortarefas.Infrastructure.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {
}
