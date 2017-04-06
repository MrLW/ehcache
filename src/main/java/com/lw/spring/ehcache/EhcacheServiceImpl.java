package com.lw.spring.ehcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EhcacheServiceImpl implements EhcacheService {
	
	/**
	 * @Cacheable
	 * 表明所修饰的方法是可以缓存的：当第一次调用这个方法时，
	 * 它的结果会被缓存下来，在缓存的有效时间内，
	 * 以后访问这个方法都直接返回缓存结果，不再执行方法中的代码段。
	 * @CachePut:功能比@Cacheable更强，不仅缓存方法结果，还缓存代码段
	 * @CacheEvict：功能和@Cacheable功能相反，@CacheEvict表明所修饰的方法是用来删除失效或无用的缓存数据。
	 * @CacheConfig：与前面的缓存注解不同，这是一个类级别的注解。如果类的所有操作都是缓存操作，你可以使用@CacheConfig来指定类，省去一些配置。
	 * 
	 * 这个方法会以key中的值作为缓存中的key,返回结果作为缓存中的值进行缓存
	 */
	@Cacheable(value = "cacheTest", key = "#param")
	public String getTime(String param) {
		Long time = System.currentTimeMillis();
		return time.toString();
	}
}
