package com.xiehou.share.springboot.model;

import java.io.Serializable;

public class JobTaskDTO implements Serializable {

    private static final long serialVersionUID = -5584489704387387300L;

    private Long              id;

    /**
     * 作业任务代码
     */
    private String            taskCode;

    /**
     * 任务参数
     */
    private String            taskParams;

    /**
     * 任务优先级
     */
    private Integer           ordering;

    /**
     * 任务名称
     */
    private String            taskName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getTaskParams() {
        return taskParams;
    }

    public void setTaskParams(String taskParams) {
        this.taskParams = taskParams;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

}
