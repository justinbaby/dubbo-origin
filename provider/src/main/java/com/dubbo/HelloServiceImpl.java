package com.dubbo;

/**
 * hello 服务 impl
 *
 * @author yzllz
 * @date 2024/02/26
 */
public class HelloServiceImpl implements HelloService {

    /**
     * 你好
     *
     * @param name 名字
     * @return {@link String}
     */
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

}
