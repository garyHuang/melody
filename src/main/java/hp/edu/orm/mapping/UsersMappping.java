package hp.edu.orm.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import hp.edu.orm.domain.Users;


public interface UsersMappping {
	@Delete({
		"delete from users",
		"where id = #{id,jdbcType=VARCHAR}"
	})
	int deleteByPrimaryKey(String id);
	
	
	@Insert({
        "insert into users (password,user_type,create_time,mobile_phone,name,id,portrait_url,email,remarks,enabled,username)",
        "values (#{password,jdbcType=VARCHAR},#{userType,jdbcType=VARCHAR},#{createTime,jdbcType=TIMESTAMP},#{mobilePhone,jdbcType=VARCHAR},#{name,jdbcType=VARCHAR},#{id,jdbcType=VARCHAR},#{portraitUrl,jdbcType=VARCHAR},#{email,jdbcType=VARCHAR},#{remarks,jdbcType=VARCHAR},#{enabled,jdbcType=BIT},#{username,jdbcType=VARCHAR})"
    })
    int insert(Users users);
    
    
     @Select({
        "select",
        "password,user_type,create_time,mobile_phone,name,id,portrait_url,email,remarks,enabled,username",
        "from users"
    })
    @Results({
    	@Result(column="password", property="password", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="user_type", property="userType", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP )
    	,@Result(column="mobile_phone", property="mobilePhone", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="name", property="name", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="id", property="id", jdbcType=JdbcType.VARCHAR ,id=true)
    	,@Result(column="portrait_url", property="portraitUrl", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="email", property="email", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="enabled", property="enabled", jdbcType=JdbcType.BIT )
    	,@Result(column="username", property="username", jdbcType=JdbcType.VARCHAR )
    	
    })
    List<Users> selectAll();
    
    
     @Select({
        "select",
        "password,user_type,create_time,mobile_phone,name,id,portrait_url,email,remarks,enabled,username",
        "from users where id=#{id,jdbcType=VARCHAR}"
    })
    @Results({
    	@Result(column="password", property="password", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="user_type", property="userType", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP )
    	,@Result(column="mobile_phone", property="mobilePhone", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="name", property="name", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="id", property="id", jdbcType=JdbcType.VARCHAR ,id=true)
    	,@Result(column="portrait_url", property="portraitUrl", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="email", property="email", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR )
    	,@Result(column="enabled", property="enabled", jdbcType=JdbcType.BIT )
    	,@Result(column="username", property="username", jdbcType=JdbcType.VARCHAR )
    	
    })
    Users selectByPrimaryKey(String id);
    
     @Update({  
        "update users" , 
        "set id = #{id,jdbcType=VARCHAR},",
        "where id = #{id,jdbcType=VARCHAR}" 
    })
    int updateByPrimaryKey(Users users);
     
     @SelectProvider(method = "selectInActive" , type=UsersSqlProvider.class)
     @Results({
     	@Result(column="password", property="password", jdbcType=JdbcType.VARCHAR )
     	,@Result(column="user_type", property="userType", jdbcType=JdbcType.VARCHAR )
     	,@Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP )
     	,@Result(column="mobile_phone", property="mobilePhone", jdbcType=JdbcType.VARCHAR )
     	,@Result(column="name", property="name", jdbcType=JdbcType.VARCHAR )
     	,@Result(column="id", property="id", jdbcType=JdbcType.VARCHAR ,id=true)
     	,@Result(column="portrait_url", property="portraitUrl", jdbcType=JdbcType.VARCHAR )
     	,@Result(column="email", property="email", jdbcType=JdbcType.VARCHAR )
     	,@Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR )
     	,@Result(column="enabled", property="enabled", jdbcType=JdbcType.BIT )
     	,@Result(column="username", property="username", jdbcType=JdbcType.VARCHAR )
     	
     })
     List<Users> selectInActive(Users obj);
}