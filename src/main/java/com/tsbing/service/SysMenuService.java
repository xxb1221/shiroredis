package com.tsbing.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsbing.entity.SysMenuEntity;

import java.util.List;

/**
 * @author xiexiaobing
 * @email xiexb1221@163.com
 * @date 2019-09-02
 * 菜单
 */
public interface SysMenuService extends IService<SysMenuEntity> {

    /**
     * 根据角色查询用户权限
     * @author xiexiaobing
     * @email xiexb1221@163.com
     * @date 2019-09-02
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    List<SysMenuEntity> selectSysMenuByRoleId(Long roleId);
}
