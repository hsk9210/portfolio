package org.hsk9210.auth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
	private Map<String, User> userMap = new HashMap<>();
	
	public User findUserById(String id) {
		return userMap.get(id);
	}
	//일반적인 for 문
	public void setUsers(List<User>users) {
		for(int i=0;i<users.size()-1;i++) {
			userMap.put(users.get(i).getId(), users.get(i));
		}
	}
	//향상된 for 문 for Obj
	public void setUsers2(List<User>users) {
		for(User u: users) {
			userMap.put(u.getId(), u);
		}
	}
	

}
