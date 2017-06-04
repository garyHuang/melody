package hp.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import hp.edu.orm.domain.Users;
import hp.edu.service.UsersService;

@SpringBootApplication(scanBasePackages={"hp.edu.**"})
@MapperScan("hp.edu.orm.mapping")
public class HpEduApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(HpEduApp.class,args);
		UsersService bean = run.getBean(UsersService.class);
		Users user = bean.selectByPrimaryKey("67e1a3c4971c4a8b871d1a64195f556f");
		System.out.println( user.getName() ); 
	}

}
