package com.alinesno.infra.base.id.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.id.entity.DistributionManagementEntity;
import com.alinesno.infra.base.id.mapper.DistributionManagementMapper;
import com.alinesno.infra.base.id.service.IDistributionManagementService;
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
public class DistributionManagementServiceImpl extends IBaseServiceImpl<DistributionManagementEntity, DistributionManagementMapper> implements IDistributionManagementService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(DistributionManagementServiceImpl.class);

}
