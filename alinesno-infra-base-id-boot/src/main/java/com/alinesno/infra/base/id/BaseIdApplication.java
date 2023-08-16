package com.alinesno.infra.base.id;

import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 集成一个Java开发示例工具
 * @author LuoAnDong
 * @since 2023年8月3日 上午6:23:43
 */
@EnableLeafServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BaseIdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseIdApplication.class, args);
	}

}