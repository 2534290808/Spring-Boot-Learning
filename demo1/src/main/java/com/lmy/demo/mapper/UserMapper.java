package com.lmy.demo.mapper;

import com.lmy.demo.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * user数据连接层mapper
 * 
 * @author 黎明宇
 * @date 2017年9月4日
 * @version
 */
@Component("userMapper")
public interface UserMapper {

	/**
	 * 得到用户信息
	 * 
	 * @param user
	 * @return User
	 */
	User getUser(User user);

	/**
	 * 根据条件获取用户信息
	 * 
	 * @param user
	 * @return List<User>
	 */
	List<User> getUsers(User user);

	/**
	 * 新增用户
	 * 
	 * @param user
	 * @return int
	 */
	int insertUser(User user);

	/**
	 * 更新用户
	 * 
	 * @param user
	 * @return int
	 */
	int updateUser(User user);

	/**
	 * 删除用户
	 * 
	 * @param user
	 * @return int
	 */
	int deleteUser(User user);
}
