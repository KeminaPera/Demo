package com.keminapera.springboot.arguments;

import org.junit.Test;

/**
 * ApplicationArguments测试类
 *
 * @author keminapera
 * @date 2020/9/10
 */
public class ApplicationArgumentsTest {
    /**
     * 验证：通过ApplicationArguments对象可以拿到main方法传入的参数
     *
     * 1. 创建SpringApplication对象
     * 2. 创建需要传入的参数
     * 3. 通过获取spring上下文工具类获取ApplicationArguments对象
     * 4. 断言验证是否包含所有传入的参数
     */
    @Test
    public void testApplicationArguments() {
        /*SpringApplication application = new SpringApplication(AppConfig.class);
        String[] args = {"java", "c#", "python"};
        application.run(args);
        MyApplicationArgument bean = ApplicationContextUtil.getApplicationContext()
                .getBean(MyApplicationArgument.class);

        assertNotNull(bean);
        assertThat(Arrays.asList(bean.getArgs()), contains(args));*/
    }
}
