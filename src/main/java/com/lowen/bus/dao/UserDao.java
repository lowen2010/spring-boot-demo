package com.lowen.bus.dao;

import java.util.List;

import com.lowen.bus.bean.UserInfo;
import com.lowen.common.persistence.Page;

public interface UserDao {

	/**
	 * 分页查询用户信息
	 * @param page
	 * @return
	 */
	public List<UserInfo> queryUserByPage(Page<UserInfo> page);
}
