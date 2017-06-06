package hp.edu.orm.mapping;

import org.apache.ibatis.jdbc.SQL;

import hp.edu.orm.domain.Users;

public class UsersSqlProvider {
	
	public String selectByAny(Users users){
		 SQL sql = new SQL();
		 sql.SELECT("id","username","password","name","email","mobile_phone","create_time","remarks","user_type","portrait_url","enabled");
		 sql.FROM("users");
		 
		 return sql.toString() ; 
	}
	
}
