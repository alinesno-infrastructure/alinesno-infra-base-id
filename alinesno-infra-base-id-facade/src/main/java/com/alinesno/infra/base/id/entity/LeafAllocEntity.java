package com.alinesno.infra.base.id.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Timestamp;

/**
 * 功能名：Leaf Alloc
 * 数据表：leaf_alloc
 * 表备注：Leaf Alloc
 * 
 * 此类表示Leaf Alloc实体。
 * 
 * 字段说明：
 * - bizTag: 业务标签
 * - maxId: 最大ID
 * - step: 步长
 * - description: 描述
 * - updateTime: 更新时间
 * 
 * 该实体类使用MyBatis-Plus提供的注解进行字段映射。
 * 
 * 注意：由于没有提供字段的中文注释信息，以下字段注释仅供参考。
 * 
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("leaf_alloc")
public class LeafAllocEntity extends InfraBaseEntity {
    /**
     * 业务标签
     */
    @TableField("biz_tag")
    private String bizTag;

    /**
     * 最大ID
     */
    @TableField("max_id")
    private Long maxId;

    /**
     * 步长
     */
    @TableField("step")
    private Integer step;

    /**
     * 描述
     */
    @TableField("description")
    private String description;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Timestamp updateTime;

    // getter and setter methods

    public String getBizTag() {
        return bizTag;
    }

    public void setBizTag(String bizTag) {
        this.bizTag = bizTag;
    }

    public Long getMaxId() {
        return maxId;
    }

    public void setMaxId(Long maxId) {
        this.maxId = maxId;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
