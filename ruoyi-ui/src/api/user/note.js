import request from '@/utils/request'

// 查询笔记列表
export function listNote(query) {
  return request({
    url: '/user/note/list',
    method: 'get',
    params: query
  })
}

// 查询笔记详细
export function getNote(id) {
  return request({
    url: '/user/note/' + id,
    method: 'get'
  })
}

// 新增笔记
export function addNote(data) {
  return request({
    url: '/user/note',
    method: 'post',
    data: data
  })
}

// 修改笔记
export function updateNote(data) {
  return request({
    url: '/user/note',
    method: 'put',
    data: data
  })
}

// 删除笔记
export function delNote(id) {
  return request({
    url: '/user/note/' + id,
    method: 'delete'
  })
}

// 导出笔记
export function exportNote(query) {
  return request({
    url: '/user/note/export',
    method: 'get',
    params: query
  })
}