package hp.edu.service;

import java.util.List;
import hp.edu.orm.domain.Users;

import org.springframework.stereotype.Service;
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
}