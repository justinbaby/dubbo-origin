package com.dubbo;

/**
 * Hello 服务
 *
 * @author yzllz
 * @date 2024/02/26
 */
public interface HelloService {

    /**
     * 你好
     *
     * @param name 名字
     * @return {@link String}
     */
    String hello(String name);

}
