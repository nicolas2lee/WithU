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
        entityManagerFactoryRef = "oscraEntityManagerFactory",
        transactionManagerRef = "oscraTransactionManager",
        basePackages =  "tao.oscra" )
public class OscraDataSourceConfig {
    @Bean(name = "oscraDataSource")

    @ConfigurationProperties(prefix = "oscra.datasource")
    public DataSource dataSourceOscra() {
        return (DataSource) DataSourceBuilder.create().build();
    }

    @Bean(name = "oscraEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("oscraDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("tao")
                .persistenceUnit("keops")
                .build();
    }

    @Bean(name = "oscraTransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("oscraEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
