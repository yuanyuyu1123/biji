package com.ruoyi.user.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 笔记对象 note
 *
 * @author ruoyi
 * @date 2021-10-20
 */
public class Note extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 笔记编号
     */
    private Long id;

    /**
     * 笔记内容
     */
    private String content;

    /**
     * 点赞数
     */
    @Excel(name = "点赞数")
    private Integer likeNumber;

    /**
     * 评论数
     */
    @Excel(name = "评论数")
    private Integer commentNumber;

    /**
     * 标签
     */
    @Excel(name = "标签")
    private String tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("content", getContent())
                .append("likeNumber", getLikeNumber())
                .append("commentNumber", getCommentNumber())
                .append("tag", getTag())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
