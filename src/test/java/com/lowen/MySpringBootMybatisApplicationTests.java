package com.lowen;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lowen.bus.bean.UserInfo;
import com.lowen.bus.service.UserService;
import com.lowen.common.utils.JsonMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringBootMybatisApplicationTests {
	
	private static final Logger logger = LoggerFactory.getLogger(MySpringBootMybatisApplicationTests.class);

	@Autowired
	private UserService userService;
	
	@Test
	public void contextLoads() {
		List<UserInfo> userList = userService.queryUserByPage(1).getList();
		logger.info("===>{}",JsonMapper.toJsonString(userList));
	}

}
