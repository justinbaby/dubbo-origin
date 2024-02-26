package com.dubbo;

/**
 * RPC 提供程序
 *
 * @author yzllz
 * @date 2024/02/26
 */
public class RpcProvider {

    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }

}
