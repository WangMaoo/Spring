package com.itheima.project.pojo;

import java.util.Date;

/**
 * @Description：文件上传对象
 */
public class FileObject {

    //主键
    private Integer Id;

    //业务主键
    private Integer businessId;

    //业务类型
    private String businessType;

    //访问路径
    private String pathUrl;

    //后缀名称
    private String suffix;

    //文件名称
    private String fileName;

    //创建时间
    private Date createTime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPathUrl() {
        return pathUrl;
    }

    public void setPathUrl(String pathUrl) {
        this.pathUrl = pathUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "FileObject{" +
                "Id='" + Id + '\'' +
                ", businessId='" + businessId + '\'' +
                ", businessType='" + businessType + '\'' +
                ", suffix='" + suffix + '\'' +
                ", pathUrl='" + pathUrl + '\'' +
                ", fileName='" + fileName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
