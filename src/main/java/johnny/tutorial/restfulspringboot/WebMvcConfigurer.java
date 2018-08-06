package johnny.tutorial.restfulspringboot;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
class WebMvcConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/public/**").addResourceLocations(
            "file:./public/"
        );
        registry.addResourceHandler("/images/**").addResourceLocations(
            "file:./src/main/resources/images/"
        );
    }
}