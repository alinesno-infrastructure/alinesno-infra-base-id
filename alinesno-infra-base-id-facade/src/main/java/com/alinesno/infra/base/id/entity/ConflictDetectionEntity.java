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
@TableName("conflict_detection")
public class ConflictDetectionEntity extends InfraBaseEntity {
	/**
	 * 应用ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("应用ID")
	@TableField("app_id")
	private Long appId;

	/**
	 * 冲突ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("冲突ID")
	@TableField("conflict_id")
	private Long conflictId;

	/**
	 * 检测时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("检测时间")
	@TableField("detection_time")
	private Date detectionTime;

	/**
	 * 检测结果
	 */
	@ColumnType(length = 100)
	@ColumnComment("检测结果")
	@TableField("detection_result")
	private String detectionResult;

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
