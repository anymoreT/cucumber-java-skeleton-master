package skeleton.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import skeleton.utils.DataRepo;


@Configuration
@ComponentScan(basePackages = {"skeleton", "skeleton.steps"})
public class TestConfiguration {
    static int i = 0;
    @Bean(name="DataRepoBean")
    public DataRepo dataRepo()  {
        DataRepo dataRepo = new DataRepo();
        String environment = System.getProperty("environment");
        i = i+1;
        System.out.print("========当前环境=========environment:" + environment+ "index: " + i);
        return dataRepo;
    }
    
}