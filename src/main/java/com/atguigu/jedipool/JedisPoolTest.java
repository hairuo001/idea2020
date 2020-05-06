package com.atguigu.jedipool;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Protocol;

/**
 * @Description TODO
 * @Author TuoLi
 * @Date 2020/5/6 0:56
 * @Version 1.0
 */
public class JedisPoolTest {
    public static void main(String[] args) {
        //1.定义ip
        String host = "192.168.1.131";

        //2.定义redis端口号
        int port = Protocol.DEFAULT_PORT;

        //3.创建连接池
        JedisPool jedisPool = new JedisPool(host, port);

        //4.获取Jedis对象
        Jedis jedis = jedisPool.getResource();

        //5.ping响应
        String ping = jedis.ping();
        System.out.println(ping);
        jedis.set("JedisPool", "Successful");

        System.out.println(jedis.get("JedisPool"));

        //6.关闭连接池
        jedisPool.close();
    }
}
