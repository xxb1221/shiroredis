package com.tsbing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsbing.dao.SysMenuDao;
import com.tsbing.entity.SysMenuEntity;
import com.tsbing.service.SysMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiexiaobing
 * @email xiexb1221@163.com
 * @date 2019-09-02
 * 菜单
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

    /**
     * 根据角色查询用户权限
     * @author xiexiaobing
     * @email xiexb1221@163.com
     * @date 2019-09-02
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    @Override
    public List<SysMenuEntity> selectSysMenuByRoleId(Long roleId) {
        return this.baseMapper.selectSysMenuByRoleId(roleId);
    }
}
