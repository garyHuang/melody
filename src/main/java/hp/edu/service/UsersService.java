package hp.edu.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import hp.edu.controller.view.DataTableResult;
import hp.edu.orm.domain.Users;
import hp.edu.orm.mapping.UsersMappping;

@Service
@Transactional
public class UsersService {

	@Autowired
	private UsersMappping mapping;

	public int deleteByPrimaryKey(String id) {
		return mapping.deleteByPrimaryKey(id);
	}

	public int insert(Users users) {
		return mapping.insert(users);
	}

	public Page<Users> selectAll() {
		Page<Users> startPage = PageHelper.startPage(1, 1);
		mapping.selectAll();
		return startPage;
	}

	public Users selectByPrimaryKey(String id) {
		return mapping.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKey(Users users) {
		return mapping.updateByPrimaryKey(users);
	}

	public Page<Users> selectByAny(Users users , DataTableResult result) {
		Page<Users> startPage = PageHelper.startPage(result.getStart(), result.getLength() );
		mapping.selectByAny(users);
		return startPage;
	}
	
	
	
	public Page<Map<String,Object>> selectMaps(Users users , DataTableResult result) {
		Page<Map<String,Object>> startPage = PageHelper.startPage(result.getStart(), result.getLength() );
		mapping.selectMaps(users);
		return startPage; 
	}
}