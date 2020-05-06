package com.atguigu.jedis;

import redis.clients.jedis.Jedis;

/**
 * @Description jedis 测试
 * @Author TuoLi
 * @Date 2020/5/6 0:45
 * @Version 1.0
 */
public class JedisTest {
    public static void main(String[] args) {
        //1.指定端ip、口号
        Jedis jedis = new Jedis("192.168.1.131", 6379);
        //2.ping响应
        String ping = jedis.ping();
        System.out.println(ping);

        jedis.set("jedis", "test");
        System.out.println(jedis.get("jedis"));
        //3.关闭连接
        jedis.close();
    }
}
