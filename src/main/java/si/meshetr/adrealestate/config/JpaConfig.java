package si.meshetr.adrealestate.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
class JpaConfig {

    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
                .url(getDataSourceUrl())
                .username(System.getenv("DB_USER"))
                .password(System.getenv("DB_PASS"))
                .build();
    }

    private String getDataSourceUrl() {
        return "jdbc:postgresql://"
                + System.getenv("DB_HOST") + ":" +System.getenv("DB_PORT") + "/"
                + System.getenv("DB_NAME");
    }
}
