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
@TableName("id_generation_strategy")
public class IdGenerationStrategyEntity extends InfraBaseEntity {
	/**
	 * 应用ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("应用ID")
	@TableField("app_id")
	private Long appId;

	/**
	 * ID长度
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("ID长度")
	@TableField("id_length")
	private Long idLength;

	/**
	 * ID前缀
	 */
	@ColumnType(length = 20)
	@ColumnComment("ID前缀")
	@TableField("id_prefix")
	private String idPrefix;

	/**
	 * 递增步长
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("递增步长")
	@TableField("incremental_step")
	private Long incrementalStep;

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
