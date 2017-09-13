package br.com.indra.jovemprofissional;


import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@SpringBootApplication

public class Configuracao {
	
    public static void main(String[] args){
    	
        SpringApplication.run(Configuracao.class, args);
    }
    
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:treina");
        dataSource.setUsername("system");
        dataSource.setPassword("K12345678k$");
        return dataSource;
    }
    
    
    
   
}
