package com.tsbing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsbing.dao.SysRoleMenuDao;
import com.tsbing.entity.SysRoleMenuEntity;
import com.tsbing.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * @author xiexiaobing
 * @email xiexb1221@163.com
 * @date 2019-09-02
 * 角色菜单
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {
}
