package com.extremebike.agendadortarefas.business.mapper;

import com.extremebike.agendadortarefas.Infrastructure.entity.TarefasEntity;
import com.extremebike.agendadortarefas.business.dto.TarefasDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
