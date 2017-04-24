package com.yyf.ff.domain;

import com.yyf.ff.mapper.UserDoMapper;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/4/20.
 */
@Slf4j
public class UserDoTest extends BaseSpringTest{
    @Autowired
    private UserDoMapper userDoMapper;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void testFindByid(){

        UserDo user = new UserDo();
        user.setId(1);
        //按照主键查询user
        UserDo res = userDoMapper.selectOne(user);
        log.info("查询结果 Userdo：{}",res.toString());
    }
}