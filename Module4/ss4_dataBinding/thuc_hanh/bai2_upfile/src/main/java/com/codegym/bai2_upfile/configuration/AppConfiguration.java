package com.codegym.bai2_upfile.configuration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

import java.io.IOException;

@Configuration
@EnableWebMvc
@ComponentScan("com.codegym.bai2_upfile.controller")
@PropertySource("classpath:upload_file.properties")
public class AppConfiguration implements WebMvcConfigurer, ApplicationContextAware {
    @Value("${file-upload}")
    private String fileUpload;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    //Cấu hình Thymleaf
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/views/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        return templateEngine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setCharacterEncoding("UTF-8");
        return viewResolver;
    }

    //Cấu hình upload file
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //Phương thức này được ghi đè từ interface WebMvcConfigurer.
        //Nó được sử dụng để đăng ký các Resource Handler (bộ xử lý tài nguyên) trong ứng dụng Spring MVC
        ///image/** (ví dụ: /image/abc.jpg), và nó sẽ được xử lý bởi thư mục được chỉ định trong biến fileUpload.
        registry.addResourceHandler("/image/**")
                .addResourceLocations("file:" + fileUpload);
        //addResourceLocations("file:" + fileUpload): Đây là phương thức của đối tượng ResourceHandlerRegistration
        // để chỉ định vị trí của tài nguyên được xử lý bởi Resource Handler (ví dụ: /image/abc.jpg)
        //chỉ định đường dẫn tới thư mục upload file (fileUpload) bằng cách sử dụng tiền tố file:
    }

    @Bean(name = "multipartResolver") // annotation để chú thích trên một phương thức (getResolver()) để đánh dấu nó là một Bean trong container của Spring
    public CommonsMultipartResolver getResolver() throws IOException {
        //CommonsMultipartResolver để xử lý request chứa dữ liệu multipart (ví dụ: request upload file)
        //và đặt giới hạn kích thước tối đa cho mỗi file là 50MB =52428800 bytes
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setMaxUploadSizePerFile(52428800);
        return resolver;
    }
}