package com.baomidou.springboot.config;

import com.zaxxer.hikari.HikariDataSource;
import io.shardingjdbc.core.api.ShardingDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by wangxc on 2017/11/10 10:36.
 */
@Configuration
public class ShardingJdbcConfig {
//    @Bean("dataSource")
//    public DataSource hikariDataSource() throws IOException, SQLException {
//        DataSource dataSource = ShardingDataSourceFactory.createDataSource(new File("classpath:/application.yml"));
//        return dataSource;
//    }
}
