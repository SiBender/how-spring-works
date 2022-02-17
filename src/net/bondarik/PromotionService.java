package net.bondarik;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.stereotype.Component;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextCloseEvent;

@Component
public class PromotionService implements BeanNameAware, ApplicationListener<ContextCloseEvent> {
    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void onApplicationEvent(ContextCloseEvent event) {
        System.out.println(">> ContextClosed EVENT performed");
    }
}
