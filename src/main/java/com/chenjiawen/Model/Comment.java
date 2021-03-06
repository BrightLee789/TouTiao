package com.chenjiawen.Model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Comment {
    private int id;
    private int userId;//评论者Id
    private Date createDate;
    private int entityId;//实体Id
    private int entityType;//实体类型
    private int status;//0，启用；1，禁用
    private String content;//评论内容

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public int getEntityType() {
        return entityType;
    }

    public void setEntityType(int entityType) {
        this.entityType = entityType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", createDate=" + createDate +
                ", entityId=" + entityId +
                ", entityType=" + entityType +
                ", status=" + status +
                ", content='" + content + '\'' +
                '}';
    }
}
