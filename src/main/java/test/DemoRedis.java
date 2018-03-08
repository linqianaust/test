package test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
public class DemoRedis {
    private static JedisPool jedisPool;
    private static Jedis jedis;

   static  {

        JedisPoolConfig jedisconfig = new JedisPoolConfig();
        jedisconfig.setMaxActive(1000);
        jedisconfig.setMaxIdle(1000);
        jedisconfig.setMaxWait(1000);
        jedisconfig.setTestOnBorrow(true);
        jedisconfig.setTestOnReturn(true);
        jedisPool = new JedisPool(jedisconfig, "127.0.0.1",
                6379, 100000);
        jedis =  jedisPool.getResource();
    }

    public static  Jedis getJedis(){
       return jedis;
    }

    public static void main(String [] args){

        /*Double d = 0.89;
        Float f = 0.98f;
        double d2 = 0.9;
        Thread thread = new Thread(){
            public void run(){
                pong();
            }
        };


        thread.start();
        System.out.println("pin1");*/

        System.out.println(getJedis());
        Executors.newCachedThreadPool();

        /*HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("","");
        hashMap.get("");*/
    }
    static void pong(){
        System.out.println("ping");
    }



}
