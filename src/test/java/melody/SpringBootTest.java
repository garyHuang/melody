package melody;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;

import hp.edu.HpEduApp;
import hp.edu.controller.view.DataTableResult;
import hp.edu.orm.domain.Users;
import hp.edu.service.UsersService;

@RunWith(SpringRunner.class)
@org.springframework.boot.test.context.SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = HpEduApp.class)
public class SpringBootTest {

	@Autowired
	protected UsersService usersService ;
	
	@Test
	public void test(){
		Users users = new Users();
		users.setId("0d5468b8a9c2441da9ef7e98fbf81cff");
		DataTableResult dtr = new DataTableResult();
		Page<Map<String, Object>> selectMaps = usersService.selectMaps(users, dtr); 
		System.out.println( JSON.toJSONString(selectMaps));  
		
		
		Page<Users> selectByAny = usersService.selectByAny(users, dtr); 
		System.out.println( JSON.toJSONString(selectByAny));  
	}
}
