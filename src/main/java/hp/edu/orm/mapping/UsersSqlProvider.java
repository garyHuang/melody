package hp.edu.orm.mapping; 

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import hp.edu.orm.domain.Users;

public class UsersSqlProvider{
	
	public String selectInActive(Users obj){
		SQL sql = new SQL();
		sql.SELECT( "password" , "user_type" , "create_time" , "mobile_phone" , "name" , "id" , "portrait_url" , "email" , "remarks" , "enabled" , "username"  ); 
		sql.FROM( "users" );
		
				if( StringUtils.isNotBlank( obj.getPassword() )){ 
			
				sql.AND().WHERE("password = #{password}") ; 
			}
				if( StringUtils.isNotBlank( obj.getUserType() )){ 
			
				sql.AND().WHERE("user_type = #{userType}") ; 
			}
				if( null != obj.getCreateTime() ){
			
				sql.AND().WHERE("create_time = #{createTime}") ; 
			}
				if( StringUtils.isNotBlank( obj.getMobilePhone() )){ 
			
				sql.AND().WHERE("mobile_phone = #{mobilePhone}") ; 
			}
				if( StringUtils.isNotBlank( obj.getName() )){ 
			
				sql.AND().WHERE("name = #{name}") ; 
			}
				if( StringUtils.isNotBlank( obj.getId() )){ 
			
				sql.AND().WHERE("id = #{id}") ; 
			}
				if( StringUtils.isNotBlank( obj.getPortraitUrl() )){ 
			
				sql.AND().WHERE("portrait_url = #{portraitUrl}") ; 
			}
				if( StringUtils.isNotBlank( obj.getEmail() )){ 
			
				sql.AND().WHERE("email = #{email}") ; 
			}
				if( StringUtils.isNotBlank( obj.getRemarks() )){ 
			
				sql.AND().WHERE("remarks = #{remarks}") ; 
			}
				if( null != obj.isEnabled() ){
			
				sql.AND().WHERE("enabled = #{enabled}") ; 
			}
				if( StringUtils.isNotBlank( obj.getUsername() )){ 
			
				sql.AND().WHERE("username like  \"%\"#{username}\"%\"") ; 
			}
		
		return sql.toString() ;  
	}
	
}