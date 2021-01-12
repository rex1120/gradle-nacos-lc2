package com.lc.nacosprovider.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.nacosprovider.modules.dao.SysUserDao;
import com.lc.nacosprovider.modules.entity.SysUser;
import com.lc.nacosprovider.modules.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * 用户表(SysUser)表服务实现类
 *
 * @author lc
 * @since 2021-01-12 16:49:33
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {

}
