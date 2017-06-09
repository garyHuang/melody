package hp.edu.service;

import java.util.List;
import hp.edu.controller.view.DataTableResult;
import hp.edu.orm.domain.Users;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import hp.edu.orm.mapping.UsersMappping; 

@Service
public class UsersService {
	
	@Autowired
	private UsersMappping mapping;
	
	public int deleteByPrimaryKey(String id){
		return mapping.deleteByPrimaryKey(id);
	}
	
   public int insert(Users users){
    	return mapping.insert( users );
    }
    
    public List<Users> selectAll(){
   	 return mapping.selectAll() ;
    }
    
    public Users selectByPrimaryKey(String id){
    	return mapping.selectByPrimaryKey( id ) ;
    }
    
    public int updateByPrimaryKey(Users users){
    	return mapping.updateByPrimaryKey( users ) ; 
    }
    
    public DataTableResult selectInActive(Users obj,DataTableResult result){
    	Page<Users> page = PageHelper.startPage(result.getStart(), result.getLength()) ;
    	mapping.selectInActive(obj) ;
    	result.setAaData(page);
		result.setRecordsFiltered(page.getTotal());
		result.setRecordsTotal( page.getTotal() );
    	return result;
    }
}