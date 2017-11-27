package com.lowen.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lowen.bus.bean.UserInfo;
import com.lowen.bus.dao.UserDao;
import com.lowen.common.Global;
import com.lowen.common.persistence.Page;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public Page<UserInfo> queryUserByPage(int curPage){
		Page<UserInfo> page = new Page<UserInfo>();
		page.setPageNo(curPage);
//		page.setPageSize(5);
		page.setPageSize(Integer.valueOf(Global.getConfig("page.pageSize")));
		page.setList(userDao.queryUserByPage(page));
		return page;
	}
	

}
