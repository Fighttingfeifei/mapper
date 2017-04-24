package com.yyf.ff.domain;

import com.yyf.ff.mapper.UserOkMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * Created by Administrator on 2017/4/22.
 */
@Slf4j
public class UserOkTest extends BaseSpringTest{
    @Autowired(required = false)
    private UserOkMapper userOkMapper;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void UserOL(){
        UserOk user = new UserOk();
        user.setUserId(1016L);
        //按照主键查询user
        UserOk res = userOkMapper.selectOne(user);
        log.info("查询结果 UserOk：{}",res.toString());
    }
    @Test
    public void UserAddUser(){
        /*添加成功*/
        UserOk user = new UserOk();
        user.setAddress("一座老城");
        user.setUserName("一位伊人");
        user.setRealName("劉小婷");
        user.setPassWord("132");
        user.setEmail("384132354@qq.com");
        user.setCellPhone("12345678910");
        user.setUserType("1");
        user.setUpdateBy("1000");
        user.setState("1");
        user.setCreateBy("0");

        //按照主键查询user
        Integer res = userOkMapper.insert(user);
        log.info("影響的行數:{}",res);

    }
}