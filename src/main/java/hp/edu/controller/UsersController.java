package hp.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hp.edu.orm.domain.Users;
import hp.edu.service.UsersService;

@RequestMapping("/admin/users")
@RestController
public class UsersController {
	
	
	@Autowired
	protected UsersService usersService ;
	
	
	@RequestMapping("list")
	public void list(Users users){
		
		
		
	}
}
