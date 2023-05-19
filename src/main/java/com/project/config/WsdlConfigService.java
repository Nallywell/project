package com.project.config;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;


@EnableWs
@Configuration
@ComponentScan
public class WsdlConfigService {


    @Bean
    public ServletRegistrationBean requestDispatcher(ApplicationContext context){
        MessageDispatcherServlet mds=new MessageDispatcherServlet();
        mds.setApplicationContext(context);
        mds.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(mds, "/soap/*");



    }
    @Bean
    public XsdSchema shemaemployee(){
        return new SimpleXsdSchema(new ClassPathResource("Project.xsd"));
    }
    @Bean(name="project")
    public DefaultWsdl11Definition createWsdl(XsdSchema shema){
        DefaultWsdl11Definition wsdl=new DefaultWsdl11Definition();
        wsdl.setPortTypeName("EmployeePort");
        wsdl.setLocationUri("/soap");
        wsdl.setTargetNamespace("http://soap.com/classes");
        wsdl.setSchema(shema);
        return wsdl;
    }
    //http://localhost:8080/soap/project.wsdl

}


