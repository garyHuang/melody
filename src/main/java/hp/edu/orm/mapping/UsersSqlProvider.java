package hp.edu.orm.mapping;

import org.apache.ibatis.jdbc.SQL;

import hp.edu.orm.domain.Users;

public class UsersSqlProvider {
	
	public String selectByAny(Users users){
		 SQL sql = new SQL();
		 sql.SELECT("id" , "username");
		 sql.FROM("users");
		 if(null != users.getId()){
			 sql.WHERE("id=#{id,jdbcType=VARCHAR}") ;
		 }
		 return sql.toString() ; 
	}
}
