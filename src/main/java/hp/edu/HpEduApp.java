package hp.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import hp.edu.orm.domain.Users;
import hp.edu.orm.mapping.UsersMappping;

@SpringBootApplication(scanBasePackages={"hp.edu.**"})
@MapperScan("hp.edu.orm.mapping")
@EnableTransactionManagement
public class HpEduApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(HpEduApp.class,args);
		
		UsersMappping bean = run.getBean(UsersMappping.class);
		
		Users users = new Users();
		users.setId("f6e1f14427eb42c0a56e1104201bda6f");
		System.out.println(bean.selectByAny(users).get(0).getUsername());
	}

}
