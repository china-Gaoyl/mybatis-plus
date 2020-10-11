package com.baomidou.mybatisplus.generator.config.builder;

import com.baomidou.mybatisplus.generator.config.ConstVal;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import lombok.Getter;

/**
 * Service属性配置
 *
 * @author nieqiurong 2020/10/11.
 * @since 3.4.1
 */
@Getter
public class ServiceBuilder extends BaseBuilder {

    /**
     * 自定义继承的Service类全称，带包名
     */
    private String superServiceClass = ConstVal.SUPER_SERVICE_CLASS;
    /**
     * 自定义继承的ServiceImpl类全称，带包名
     */
    private String superServiceImplClass = ConstVal.SUPER_SERVICE_IMPL_CLASS;

    public ServiceBuilder(StrategyConfig strategyConfig) {
        super(strategyConfig);
    }

    /**
     * Service接口父类
     *
     * @param clazz 类
     * @return this
     */
    public ServiceBuilder superServiceClass(Class<?> clazz) {
        return superServiceClass(clazz.getName());
    }

    /**
     * Service接口父类
     *
     * @param superServiceClass 类名
     * @return this
     */
    public ServiceBuilder superServiceClass(String superServiceClass) {
        this.superServiceClass = superServiceClass;
        return this;
    }

    /**
     * Service实现类父类
     *
     * @param clazz 类
     * @return this
     */
    public ServiceBuilder superServiceImplClass(Class<?> clazz) {
        return superServiceImplClass(clazz.getName());
    }

    /**
     * Service实现类父类
     *
     * @param superServiceImplClass 类名
     * @return this
     */
    public ServiceBuilder superServiceImplClass(String superServiceImplClass) {
        this.superServiceImplClass = superServiceImplClass;
        return this;
    }
}
