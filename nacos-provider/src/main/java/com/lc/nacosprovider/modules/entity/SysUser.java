package com.lc.nacosprovider.modules.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 用户表(SysUser)实体类
 *
 * @author lc
 * @since 2021-01-12 16:49:30
 */

@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
@Data
public class SysUser extends Model<SysUser> {
    /**
     * 姓名（昵称）
     */
    private Long id;
    /**
     * 姓名（昵称）
     */
    private String userName;
    /**
     * 用户名
     */
    private String loginName;
    /**
     * 头像地址
     */
    private String headPicture;
    /**
     * 地址
     */
    private String address;
    /**
     * 出生日期
     */
    private Date bornDate;
    /**
     * 联系方式
     */
    private Object contactWay;


    /**
     * 性别
     */
    private Integer gender;


}
