package org.example.config;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.example.service", "org.example.dao"})
public class AppConfig {

        @Bean
        public JdbcTemplate getJdbcTemplate() {
                return new JdbcTemplate(getDataSource());
        }

        @Bean
        public DataSource getDataSource() {
                DriverManagerDataSource dataSource = new DriverManagerDataSource();
                dataSource.setUrl("jdbc:mysql://localhost:3306/JDBC_EX?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false");
                dataSource.setUsername("hbstudent");
                dataSource.setPassword("hbstudent");
                dataSource.setDriverClassName("com.mysql.jdbc.Driver");
                return dataSource;
        }

//        @Bean
//        public UserDao getUserDao() {
//                return new UserDaoImpl(getJdbcTemplate());
//        }

//        @Bean
//        public UserService getUserService() {
//                return new UserServiceImpl();
//        }

}
