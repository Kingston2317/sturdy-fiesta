package org.example.storefinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StorefinderApplication {

	public static void main(String[] args) {
		@Autowired  
                JdbcTemplate jdbcTemplate;  
                @Autowired  
                private NamedParameterJdbcTemplate jdbcTemplate;  
		SpringApplication.run(StorefinderApplication.class, args);
	}

}
