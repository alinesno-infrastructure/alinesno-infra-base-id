package com.alinesno.infra.base.id.config;

import com.alinesno.infra.common.facade.enable.EnableActable;
import com.alinesno.infra.common.web.adapter.sso.enable.EnableInfraSsoApi;
import com.alinesno.infra.common.web.log.aspect.LogAspect;
import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
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

    /**
     * 日志切面保存
     * @return
     */
    @Bean
    public LogAspect getLogAspect(){
        return new LogAspect() ;
    }

}
