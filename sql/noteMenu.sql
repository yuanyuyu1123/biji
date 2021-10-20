-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('笔记', '2000', '1', 'note', 'user/note/index', 1, 0, 'C', '0', '0', 'user:note:list', '#', 'admin', sysdate(), '', null, '笔记菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('笔记查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'user:note:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('笔记新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'user:note:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('笔记修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'user:note:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('笔记删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'user:note:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('笔记导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'user:note:export',       '#', 'admin', sysdate(), '', null, '');