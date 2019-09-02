package com.tsbing.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsbing.entity.SysRoleEntity;

import java.util.List;

/**
 * @author xiexiaobing
 * @email xiexb1221@163.com
 * @date 2019-09-02
 * 角色
 */
public interface SysRoleService extends IService<SysRoleEntity> {

    /**
     * 通过用户ID查询角色集合
     * @author xiexiaobing
     * @email xiexb1221@163.com
     * @date 2019-09-02
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);
}
