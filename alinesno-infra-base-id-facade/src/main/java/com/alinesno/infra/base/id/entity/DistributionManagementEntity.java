package com.alinesno.infra.base.id.entity;

import java.util.Date;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;


/**
 * <p>
 *
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Data
@TableName("distribution_management")
public class DistributionManagementEntity extends InfraBaseEntity {
	/**
	 * 应用ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("应用ID")
	@TableField("app_id")
	private Long appId;

	/**
	 * 节点名称
	 */
	@ColumnType(length = 100)
	@ColumnComment("节点名称")
	@TableField("node_name")
	private String nodeName;

	/**
	 * 分发数量
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("分发数量")
	@TableField("distribution_quantity")
	private Long distributionQuantity;

	/**
	 * 创建时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("创建时间")
	@TableField("create_time")
	private Date createTime;

	/**
	 * 删除标识：0-未删除，1-已删除
	 */
	@ColumnType(length = 1)
	@ColumnComment("删除标识：0-未删除，1-已删除")
	@TableField("is_deleted")
	private int isDeleted;


}
