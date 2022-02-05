package net.bondarik;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.CustomPostProcessor;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IOException, URISyntaxException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println("Hello, world!");

        BeanFactory beanFactory = new BeanFactory();
        beanFactory.addPostProcessors(new CustomPostProcessor());
        beanFactory.instantiate("net.bondarik");

        ProductService productService = (ProductService) beanFactory.getBean("productService");
        PromotionService promotionService = (PromotionService) beanFactory.getBean("promotionService");
        System.out.println(productService);
        beanFactory.populateProperties();
        System.out.println(productService.getPromotionService());
        beanFactory.injectBeanNames();
        System.out.println("Bean name = " + promotionService.getBeanName());
        beanFactory.injectBeanFactory();
        System.out.println("Injected bean factory = " + productService.getBeanFactory());
        beanFactory.initializeBeans();



    }
}
