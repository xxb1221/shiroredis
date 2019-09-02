package com.tsbing.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsbing.entity.SysUserEntity;

/**
 * @author xiexiaobing
 * @email xiexb1221@163.com
 * @date 2019-09-02
 * 用户
 */
public interface SysUserService extends IService<SysUserEntity> {

    /**
     * 根据用户名查询实体
     * @author xiexiaobing
     * @email xiexb1221@163.com
     * @date 2019-09-02
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    SysUserEntity selectUserByName(String username);
}
