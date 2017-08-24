package cache.interfaceImp.example;

import java.util.Map;

public interface Cache<K, V> {

	public V get(K key);;

	public Map<K, V> getAllPresent(Iterable<?> keys);

	public void invalidate(K key);

	public void invalidateAll();

	public void inalidateAll(Iterable<K> keys);

	public void put(K key, V value);

	public void putAll(Map<? extends K, ? extends V> m);

	public long size();

}
