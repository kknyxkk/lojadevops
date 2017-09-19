package br.com.indra.jovemprofissional;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication

public class Configuracao {

	public static void main(String[] args){
		SpringApplication.run(Configuracao.class, args);		
	}
	

	/* @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306:lojadevops");
        dataSource.setUsername("loja");
        dataSource.setPassword("loja");
        return dataSource;
    }*/




}
