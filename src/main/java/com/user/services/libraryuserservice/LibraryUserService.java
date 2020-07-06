package com.user.services.libraryuserservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.services.domain.objects.User;
import com.user.services.repository.UserRepository;
import com.user.services.util.ConstantsConfig;
import com.user.services.util.GenericResponse;

@Service
public class LibraryUserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	GenericResponse<User> userGenericResponse;
	
	public GenericResponse<User> getUserDetails(int userId){
		User userResp=userRepo.getByUserId(userId);
		if(null != userResp ) {
			userGenericResponse.setData(userResp);
			userGenericResponse.setStatus(ConstantsConfig.SUCCESS);
		}else {
			userGenericResponse.setStatus(ConstantsConfig.FAILURE);
		}
		return userGenericResponse;
	}
	
	
	
}
