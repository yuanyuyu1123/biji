package com.ruoyi.user.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.user.domain.Note;
import com.ruoyi.user.mapper.NoteMapper;
import com.ruoyi.user.service.INoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 笔记Service业务层处理
 *
 * @author ruoyi
 * @date 2021-10-20
 */
@Service
public class NoteServiceImpl implements INoteService {
    @Resource
    private NoteMapper noteMapper;

    /**
     * 查询笔记
     *
     * @param id 笔记主键
     * @return 笔记
     */
    @Override
    public Note selectNoteById(Long id) {
        return noteMapper.selectNoteById(id);
    }

    /**
     * 查询笔记列表
     *
     * @param note 笔记
     * @return 笔记
     */
    @Override
    public List<Note> selectNoteList(Note note) {
        return noteMapper.selectNoteList(note);
    }

    /**
     * 新增笔记
     *
     * @param note 笔记
     * @return 结果
     */
    @Override
    public int insertNote(Note note) {
        note.setCreateTime(DateUtils.getNowDate());
        return noteMapper.insertNote(note);
    }

    /**
     * 修改笔记
     *
     * @param note 笔记
     * @return 结果
     */
    @Override
    public int updateNote(Note note) {
        note.setUpdateTime(DateUtils.getNowDate());
        return noteMapper.updateNote(note);
    }

    /**
     * 批量删除笔记
     *
     * @param ids 需要删除的笔记主键
     * @return 结果
     */
    @Override
    public int deleteNoteByIds(Long[] ids) {
        return noteMapper.deleteNoteByIds(ids);
    }

    /**
     * 删除笔记信息
     *
     * @param id 笔记主键
     * @return 结果
     */
    @Override
    public int deleteNoteById(Long id) {
        return noteMapper.deleteNoteById(id);
    }
}
