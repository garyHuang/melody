package hp.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages={"hp.edu.**"})
@MapperScan("hp.edu.orm.mapping")
@EnableTransactionManagement
public class HpEduApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HpEduApp.class,args);
	}

}
