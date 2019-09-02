package com.tsbing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsbing.dao.SysUserRoleDao;
import com.tsbing.entity.SysUserRoleEntity;
import com.tsbing.service.SysUserRoleService;
import org.springframework.stereotype.Service;

/**
 * @author xiexiaobing
 * @email xiexb1221@163.com
 * @date 2019-09-02
 * 用户角色
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {
}
