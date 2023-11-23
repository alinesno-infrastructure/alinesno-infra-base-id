package com.alinesno.infra.base.id.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alinesno.infra.base.id.entity.LeafAllocEntity;
import com.alinesno.infra.base.id.mapper.LeafAllocMapper;
import com.alinesno.infra.base.id.service.ILeafAllocService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
public class LeafAllocServiceImpl extends IBaseServiceImpl<LeafAllocEntity, LeafAllocMapper> implements ILeafAllocService {

    // 日志记录
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(LeafAllocServiceImpl.class);

}
