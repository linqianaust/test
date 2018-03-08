package test;

import redis.clients.jedis.Jedis;

/**
 * Created by Administrator on 2018/3/4 0004.
 */
public class ClientRedis {

    Jedis jedis = null;

    public  Jedis setString(String str, String key){
        //jedis.flushAll();
        jedis = DemoRedis.getJedis();
        jedis.set(str,key);
        return jedis;
    }

    public void setLock(){
        jedis.setnx("123","34");
        jedis.setex("123",12,"34");
        jedis.expire("123",1);
    }

    public static void main(String [] args){
        ClientRedis clientRedis = new ClientRedis();
        Jedis jedis =  clientRedis.setString("oK","123");
        String value = jedis.get("oK");
        System.out.println(value);
    }
}
