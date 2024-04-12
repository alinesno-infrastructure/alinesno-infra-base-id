package com.alinesno.infra.base.id.service.impl;

import com.alinesno.infra.base.id.entity.ApplicationEntity;
import com.alinesno.infra.base.id.mapper.ApplicationMapper;
import com.alinesno.infra.base.id.service.IApplicationService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ApplicationServiceImpl extends IBaseServiceImpl<ApplicationEntity, ApplicationMapper> implements IApplicationService {

}
