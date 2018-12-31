package br.gov.caixa.jsigml.config;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JsigmlApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JsigmlApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JsigmlApplication.class, args);
	}
	
	/*@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3386/jsigml");
		dataSource.setUsername("root");
		dataSource.setPassword("caixa123");
		
		return dataSource;
		}
*/}

