package com.alinesno.infra.base.id.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.base.id.entity.IdRecoveryEntity;
import com.alinesno.infra.base.id.mapper.IdRecoveryMapper;
import com.alinesno.infra.base.id.service.IIdRecoveryService;
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
public class IdRecoveryServiceImpl extends IBaseServiceImpl<IdRecoveryEntity, IdRecoveryMapper> implements IIdRecoveryService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(IdRecoveryServiceImpl.class);

}
