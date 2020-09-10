package com.zhangdi.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author di.zhang
 * @date 2020/9/7
 * @time 17:14
 **/
public class CacheDemo {

  public static void main(String[] args) {
    CacheDemo cacheDemo = new CacheDemo();

    cacheDemo.removeListenerCacheDemo();
  }


  /**
   * 基本的cache创建
   */
  public void baseCacheDemo() {
    Cache<String, String> cache = CacheBuilder.newBuilder().build();
    cache.put("key1", "value1");
    String value = cache.getIfPresent("key1");
    System.out.println(value);
  }

  /**
   * 设置最大的cache size。 当超过最大size时， 最早放入的会被清除
   */
  public void maxSizeCacheDemo() {
    Cache<String, String> cache = CacheBuilder.newBuilder().maximumSize(2).build();
    cache.put("key1", "value1");
    cache.put("key2", "value2");
    cache.put("key3", "value3");

    System.out.println("value1 = " + cache.getIfPresent("key1"));
    System.out.println("value2 = " + cache.getIfPresent("key2"));
    System.out.println("value3 = " + cache.getIfPresent("key3"));
  }

  /**
   * 设置缓存中key的最大存活时间
   * <p>
   * 当cache中key超过ttl时间后会被自动清除
   */
  public void ttlCacheDemo() {
    Cache<String, String> cache = CacheBuilder.newBuilder().expireAfterWrite(3, TimeUnit.SECONDS)
        .build();

    cache.put("key1", "value1");
    int time = 0;
    while (true) {
      time++;
      System.out.println("第" + time + "次取到key1的值为：" + cache.getIfPresent("key1"));
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * 同时设置最大存储size和ttl。
   * <p>
   * 只要命中其中一个则会被清理
   */
  public void ttlAndMaxSizeCacheDemo() {
    Cache<String, String> cache = CacheBuilder.newBuilder().expireAfterWrite(3, TimeUnit.SECONDS)
        .maximumSize(3)
        .build();
  }

  /**
   * {@link Callable} 的demo
   * <p>
   * 当没有要查询的key时，使用使用Callable实现返回一个值
   */
  public void cacheCallableDemo() {

    Cache<String, String> cache = CacheBuilder.newBuilder().build();

    cache.put("key1", "value1");

    System.out.println(cache.getIfPresent("key1"));

    try {
      String key2 = cache.get("key2", new MyCallable());
      System.out.println(key2);
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }

  public void cacheLoadingDemo() {

  }

  /**
   * 删除缓存监听器
   */
  public void removeListenerCacheDemo() {
    Cache<String, String> cache = CacheBuilder.newBuilder().removalListener(new MyRemovalListener())
        .expireAfterWrite(3, TimeUnit.SECONDS).build();

    cache.put("key1", "value1");

    cache.invalidate("key1");

  }
}

/**
 * {@link Callable} 的实现
 */
class MyCallable implements Callable<String> {

  @Override
  public String call() throws Exception {

    return "test---" + System.currentTimeMillis();
  }
}

/**
 * 删除缓存监听器
 * <p>
 * 监听器只有在执行invalidate()操作时才会执行，因为ttl或者maxsize导致的数据自动删除不会执行监听器逻辑
 */
class MyRemovalListener implements RemovalListener<String, String> {

  @Override
  public void onRemoval(RemovalNotification<String, String> notification) {
    System.out.println(
        "remove key = " + notification.getKey() + "------ value = " + notification.getValue());
  }
}

class MyCacheLoader extends CacheLoader<String, String> {

  @Override
  public String load(String key) throws Exception {
    return null;
  }

}
