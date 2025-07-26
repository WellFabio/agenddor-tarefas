package com.extremebike.agendadortarefas.business.mapper;

import com.extremebike.agendadortarefas.Infrastructure.entity.TarefasEntity;
import com.extremebike.agendadortarefas.business.dto.TarefasDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {

    void updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);

}
