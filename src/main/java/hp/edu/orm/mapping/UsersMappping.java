package hp.edu.orm.mapping;

import java.util.List;
import java.util.Map;

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
	@Delete({ "delete from users", "where id = #{id,jdbcType=VARCHAR}" })
	int deleteByPrimaryKey(String id);

	@Insert({
			"insert into users (id,username,password,name,email,mobile_phone,create_time,remarks,user_type,portrait_url,enabled)",
			"values (#{id,jdbcType=VARCHAR},#{username,jdbcType=VARCHAR},#{password,jdbcType=VARCHAR},#{name,jdbcType=VARCHAR},#{email,jdbcType=VARCHAR},#{mobilePhone,jdbcType=VARCHAR},#{createTime,jdbcType=TIMESTAMP},#{remarks,jdbcType=VARCHAR},#{userType,jdbcType=CHAR},#{portraitUrl,jdbcType=VARCHAR},#{enabled,jdbcType=BIT})" })
	int insert(Users users);

	@Select({ "select",
			"id,username,password,name,email,mobile_phone,create_time,remarks,user_type,portrait_url,enabled",
			"from users" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "mobile_phone", property = "mobilePhone", jdbcType = JdbcType.VARCHAR),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR),
			@Result(column = "user_type", property = "userType", jdbcType = JdbcType.CHAR),
			@Result(column = "portrait_url", property = "portraitUrl", jdbcType = JdbcType.VARCHAR),
			@Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT)

	})
	List<Users> selectAll();

	@Select({ "select",
			"id,username,password,name,email,mobile_phone,create_time,remarks,user_type,portrait_url,enabled",
			"from users where id=#{id,jdbcType=VARCHAR}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "mobile_phone", property = "mobilePhone", jdbcType = JdbcType.VARCHAR),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR),
			@Result(column = "user_type", property = "userType", jdbcType = JdbcType.CHAR),
			@Result(column = "portrait_url", property = "portraitUrl", jdbcType = JdbcType.VARCHAR),
			@Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT)

	})
	Users selectByPrimaryKey(String id);

	@SelectProvider(method = "selectByAny", type = UsersSqlProvider.class)
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
			@Result(column = "mobile_phone", property = "mobilePhone", jdbcType = JdbcType.VARCHAR),
			@Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "remarks", property = "remarks", jdbcType = JdbcType.VARCHAR),
			@Result(column = "user_type", property = "userType", jdbcType = JdbcType.CHAR),
			@Result(column = "portrait_url", property = "portraitUrl", jdbcType = JdbcType.VARCHAR),
			@Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT)

	})
	List<Users> selectByAny(Users users);

	@Update({ "update users",
			"set username = #{username,jdbcType=VARCHAR},password = #{password,jdbcType=VARCHAR},name = #{name,jdbcType=VARCHAR},email = #{email,jdbcType=VARCHAR},mobile_phone = #{mobilePhone,jdbcType=VARCHAR},create_time = #{createTime,jdbcType=TIMESTAMP},remarks = #{remarks,jdbcType=VARCHAR},user_type = #{userType,jdbcType=CHAR},portrait_url = #{portraitUrl,jdbcType=VARCHAR},enabled = #{enabled,jdbcType=BIT}",
			"where id = #{id,jdbcType=VARCHAR}" })
	int updateByPrimaryKey(Users users);
	
	@SelectProvider(method = "selectMaps", type = UsersSqlProvider.class)
	List<Map<String,Object>> selectMaps(Users users);
}