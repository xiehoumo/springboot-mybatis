package com.xiehou.share.springboot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class JobDTO implements Serializable {

    private static final long serialVersionUID = -1841075368358385810L;

    private Long              id;

    /**
     * 模块代码
     */
    private String            moduleCode;

    /**
     * 作业代码
     */
    private String            jobCode;

    /**
     * 业务号
     */
    private String            businessNo;

    /**
     * 作业参数
     */
    private String            jobParams;

    /**
     * 操作人员
     */
    private String            operator;

    /**
     * 作业关联的任务列表
     */
    private List<JobTaskDTO>  tasks;

    public void addJobTask(JobTaskDTO jobTask) {
        if (jobTask == null) {
            return;
        }
        if (tasks == null) {
            tasks = new ArrayList<JobTaskDTO>();
        }
        tasks.add(jobTask);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getJobParams() {
        return jobParams;
    }

    public void setJobParams(String jobParams) {
        this.jobParams = jobParams;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<JobTaskDTO> getTasks() {
        return tasks;
    }

    public void setTasks(List<JobTaskDTO> tasks) {
        this.tasks = tasks;
    }

}
