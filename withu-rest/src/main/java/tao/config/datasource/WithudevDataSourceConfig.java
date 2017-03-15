package tao.config.datasource;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by xinrui on 12/03/17.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "withuEntityManagerFactory",
        transactionManagerRef = "withuTransactionManager",
        basePackages =  "tao.withu" )
public class WithudevDataSourceConfig {


    @Bean(name = "withuDataSource")
    @Primary
    @ConfigurationProperties(prefix = "with_udev.datasource")
    public DataSource dataSourceWithudev() {
        return (DataSource) DataSourceBuilder.create().build();
    }

    @Bean(name = "withuEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean withudevEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("withuDataSource") DataSource withudevDataSource) {
        return builder.dataSource(withudevDataSource)
                .packages("tao")
                .persistenceUnit("coda")
                .build();
    }

    @Bean(name = "withuTransactionManager")
    @Primary
    public PlatformTransactionManager withudevTransactionManager(
            @Qualifier("withuEntityManagerFactory") EntityManagerFactory withuEntityManagerFactory) {
        return new JpaTransactionManager(withuEntityManagerFactory);
    }
}
