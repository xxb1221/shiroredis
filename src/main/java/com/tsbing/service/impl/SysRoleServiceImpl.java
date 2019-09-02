package com.tsbing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsbing.dao.SysRoleDao;
import com.tsbing.entity.SysRoleEntity;
import com.tsbing.service.SysRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiexiaobing
 * @email xiexb1221@163.com
 * @date 2019-09-02
 * 角色
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

    /**
     * 通过用户ID查询角色集合
     * @author xiexiaobing
     * @email xiexb1221@163.com
     * @date 2019-09-02
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    @Override
    public List<SysRoleEntity> selectSysRoleByUserId(Long userId) {
        return this.baseMapper.selectSysRoleByUserId(userId);
    }
}
