package br.dev.fabricio.multiplosdatasources.configurations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

  @Primary
  @Qualifier("posts")
  @ConfigurationProperties(prefix = "app.datasource.posts")
  @Bean
  public DataSourceProperties postsDataSourceProperties(){
    return new DataSourceProperties();
  }

  @Primary
  @Bean
  public DataSource postsDataSource(DataSourceProperties dataSourceProperties){
   return dataSourceProperties.initializeDataSourceBuilder().build();
  }



  @Qualifier("comments")
  @ConfigurationProperties(prefix = "app.datasource.comments")
  @Bean
  public DataSourceProperties commentsDataSourceProperties(){
    return new DataSourceProperties();
  }

  @Qualifier("comments")
  @Bean
  public DataSource commentsDataSource(DataSourceProperties dataSourceProperties){
    return dataSourceProperties.initializeDataSourceBuilder().build();
  }




}
