package hp.edu.orm.mapping;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import hp.edu.orm.domain.Users;

public class UsersSqlProvider {
	
	public String selectByAny(Users users){
		 SQL sql = new SQL();
		 sql.SELECT("id","username","password","name","email","mobile_phone","create_time","remarks","user_type","portrait_url","enabled");
		 sql.FROM("users");
		 if(null != users.getId()){
			 sql.AND().WHERE("id=#{id}");
		 }
		 if( StringUtils.isNotBlank(users.getUsername())){
			 sql.AND().WHERE("username like \"%\"#{username}\"%\"") ;
		 }
		 if( StringUtils.isNotBlank(users.getName())){
			 
			 sql.AND().WHERE("name like \"%\"#{name}\"%\"") ; 
		 }
		 return sql.toString() ; 
	}
	
	
	public String selectMaps(Users users){
		 SQL sql = new SQL();
		 sql.SELECT("id","username","password","name","email","mobile_phone","create_time","remarks","user_type","portrait_url","enabled");
		 sql.FROM("users");
		 if(null != users.getId()){
			 sql.AND().WHERE("id=#{id}");
		 }
		 return sql.toString() ; 
	}
}
