package com.alinesno.infra.base.id.config;

import com.alinesno.infra.common.facade.enable.EnableActable;
import com.alinesno.infra.common.web.adapter.sso.enable.EnableInfraSsoApi;
import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 统一配置服务
 */
@EnableLeafServer
@EnableActable
@EnableInfraSsoApi
@MapperScan("com.alinesno.infra.base.id.mapper")
@Configuration
public class AppConfiguration {

}
