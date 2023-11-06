package dev.vivek.springbootredisapp.config;

import dev.vivek.springbootredisapp.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
@Configuration
public class CacheConfig {
    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        JedisConnectionFactory jcf = new JedisConnectionFactory();

        return jcf;
    }
    @Bean
    RedisTemplate<String, User> redisTemplate() {
        RedisTemplate<String, User> rt = new RedisTemplate<>();
        rt.setConnectionFactory(jedisConnectionFactory());

        return rt;
    }
}
