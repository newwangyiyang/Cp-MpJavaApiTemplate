package cn.yiyang.system.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

/**
 * @ClassName UniqueNameGenerator
 * @Description TODO
 * @Author Administrator
 * @Date 2019/7/4 16:06
 * @Version 1.0
 **/
public class UniqueNameGenerator extends AnnotationBeanNameGenerator {
    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        //全限定类名
        String beanName = definition.getBeanClassName();
        return beanName;
    }
}
