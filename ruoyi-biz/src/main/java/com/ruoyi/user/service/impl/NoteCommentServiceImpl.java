package com.ruoyi.user.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.user.domain.NoteComment;
import com.ruoyi.user.mapper.NoteCommentMapper;
import com.ruoyi.user.service.INoteCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 评论Service业务层处理
 *
 * @author ruoyi
 * @date 2021-10-20
 */
@Service
public class NoteCommentServiceImpl implements INoteCommentService {
    @Resource
    private NoteCommentMapper noteCommentMapper;

    /**
     * 查询评论
     *
     * @param id 评论主键
     * @return 评论
     */
    @Override
    public NoteComment selectNoteCommentById(Long id) {
        return noteCommentMapper.selectNoteCommentById(id);
    }

    /**
     * 查询评论列表
     *
     * @param noteComment 评论
     * @return 评论
     */
    @Override
    public List<NoteComment> selectNoteCommentList(NoteComment noteComment) {
        return noteCommentMapper.selectNoteCommentList(noteComment);
    }

    /**
     * 新增评论
     *
     * @param noteComment 评论
     * @return 结果
     */
    @Override
    public int insertNoteComment(NoteComment noteComment) {
        noteComment.setCreateTime(DateUtils.getNowDate());
        return noteCommentMapper.insertNoteComment(noteComment);
    }

    /**
     * 修改评论
     *
     * @param noteComment 评论
     * @return 结果
     */
    @Override
    public int updateNoteComment(NoteComment noteComment) {
        return noteCommentMapper.updateNoteComment(noteComment);
    }

    /**
     * 批量删除评论
     *
     * @param ids 需要删除的评论主键
     * @return 结果
     */
    @Override
    public int deleteNoteCommentByIds(Long[] ids) {
        return noteCommentMapper.deleteNoteCommentByIds(ids);
    }

    /**
     * 删除评论信息
     *
     * @param id 评论主键
     * @return 结果
     */
    @Override
    public int deleteNoteCommentById(Long id) {
        return noteCommentMapper.deleteNoteCommentById(id);
    }
}
