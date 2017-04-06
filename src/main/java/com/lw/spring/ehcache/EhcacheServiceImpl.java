package com.lw.spring.ehcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EhcacheServiceImpl implements EhcacheService {
	
	/**
	 * @Cacheable
	 * ���������εķ����ǿ��Ի���ģ�����һ�ε����������ʱ��
	 * ���Ľ���ᱻ�����������ڻ������Чʱ���ڣ�
	 * �Ժ�������������ֱ�ӷ��ػ�����������ִ�з����еĴ���Ρ�
	 * @CachePut:���ܱ�@Cacheable��ǿ���������淽�����������������
	 * @CacheEvict�����ܺ�@Cacheable�����෴��@CacheEvict���������εķ���������ɾ��ʧЧ�����õĻ������ݡ�
	 * @CacheConfig����ǰ��Ļ���ע�ⲻͬ������һ���༶���ע�⡣���������в������ǻ�������������ʹ��@CacheConfig��ָ���࣬ʡȥһЩ���á�
	 * 
	 * �����������key�е�ֵ��Ϊ�����е�key,���ؽ����Ϊ�����е�ֵ���л���
	 */
	@Cacheable(value = "cacheTest", key = "#param")
	public String getTime(String param) {
		Long time = System.currentTimeMillis();
		return time.toString();
	}
}
