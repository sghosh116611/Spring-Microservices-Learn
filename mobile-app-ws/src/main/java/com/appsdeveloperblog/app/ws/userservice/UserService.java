package com.appsdeveloperblog.app.ws.userservice;

import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

public interface UserService {

	public UserRest createUser(UserDetailsRequestModel userDetail);
	
}
