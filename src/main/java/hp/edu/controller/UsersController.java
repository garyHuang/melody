package hp.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;

import hp.edu.controller.view.DataTableResult;
import hp.edu.orm.domain.Users;
import hp.edu.service.UsersService;

@RequestMapping("/admin/users")
@RestController
public class UsersController {

	@Autowired
	protected UsersService usersService;

	@RequestMapping("list")
	public DataTableResult list(Users users,DataTableResult result) {
		
		Page<Users> pageResult = usersService.selectAll(); 
		result.setAaData(pageResult);
		result.setRecordsFiltered(pageResult.getTotal());
		result.setRecordsTotal( pageResult.getTotal() );
		return result;
	}
}
