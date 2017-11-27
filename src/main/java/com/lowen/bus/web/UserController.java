package com.lowen.bus.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lowen.bus.bean.UserInfo;
import com.lowen.bus.service.UserService;
import com.lowen.common.persistence.Page;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping("/queryUserInfo")
	@ResponseBody
	public List<UserInfo> queryUserInfo(String pageNo,HttpServletRequest request){
		
		logger.info("queryUserInfo入参pageNo={}",pageNo);
		
		List<UserInfo> list = null;
		if(StringUtils.isNotBlank(pageNo)) {
			int curPage = Integer.parseInt(pageNo);
			Page<UserInfo> page = userService.queryUserByPage(curPage);
			list = page.getList();
		}
		logger.info("queryUserInfo返回listSize={}",list.size());
		return list;
	}
	
}
