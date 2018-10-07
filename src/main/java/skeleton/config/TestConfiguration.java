package skeleton.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import skeleton.utils.DataRepo;


@Configuration
@ComponentScan(basePackages = {"skeleton", "skeleton.steps"})
public class TestConfiguration {
    @Bean(name="DataRepoBean")
    public DataRepo dataRepo()  {
        DataRepo dataRepo = new DataRepo();
        String environment = System.getProperty("environment");
        System.out.print("========当前环境=========environment:" + environment);
        return dataRepo;
    }
}