package com.alinesno.infra.base.id.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.id.entity.ApplicationManagementEntity;
import com.alinesno.infra.base.id.mapper.ApplicationManagementMapper;
import com.alinesno.infra.base.id.service.IApplicationManagementService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Service
public class ApplicationManagementServiceImpl extends IBaseServiceImpl<ApplicationManagementEntity, ApplicationManagementMapper> implements IApplicationManagementService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ApplicationManagementServiceImpl.class);

}
