package com.lc.nacosprovider.modules.controller;


import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.lc.nacosprovider.modules.entity.SysUser;
import com.lc.nacosprovider.modules.service.SysUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户表(SysUser)表控制层
 *
 * @author lc
 * @since 2021-01-12 16:49:34
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;


    @PostMapping("saveUser")
    public R saveUser(@RequestBody SysUser user){
        sysUserService.saveOrUpdate(user);
        return success(user);
    }

}
