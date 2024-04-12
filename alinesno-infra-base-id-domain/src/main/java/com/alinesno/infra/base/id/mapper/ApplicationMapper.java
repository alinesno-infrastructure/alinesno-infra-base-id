package com.alinesno.infra.base.id.mapper;

import com.alinesno.infra.base.id.entity.ApplicationEntity;
import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApplicationMapper extends IBaseMapper<ApplicationEntity> {
}
