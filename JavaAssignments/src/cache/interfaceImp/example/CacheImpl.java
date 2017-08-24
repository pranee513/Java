package cache.interfaceImp.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CacheImpl<K, V> implements Cache<K, V> {

	Map<K, V> map = new HashMap<K, V>();

	@Override
	public V get(K key) {
		return map.get(key);
	}

	@Override
	public Map<K, V> getAllPresent(Iterable<?> keys) {
		Map.Entry<K, V> mentry = null;
		Set<Entry<K, V>> set = map.entrySet();
		Iterator<Entry<K, V>> it = set.iterator();
		while (it.hasNext()) {
			mentry = (Entry<K, V>) it.next();
			map.get(mentry.getKey());
		}
		return map;

	}

	@Override
	public void invalidate(K key) {
		map.remove(key);

	}

	@Override
	public void invalidateAll() {
		map.clear();
	}

	@Override
	public void inalidateAll(Iterable<K> keys) {

		Map.Entry<K, V> mentry = null;
		Set<K> set = map.keySet();

		Iterator<K> it = set.iterator();
		while (it.hasNext()) {
			mentry = (Entry<K, V>) it.next();
			map.remove(mentry.getKey());
		}

	}

	@Override
	public void put(K key, V value) {
		map.put(key, value);
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		map.putAll(m);

	}

	@Override
	public long size() {

		int i = map.size();

		return i;
	}

	@Override
	public String toString() {
		return "CacheImpl [map=" + map + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cache<Integer, String> cache = new CacheImpl<Integer, String>();
		cache.put(1, "pranee");
		cache.put(2, "Jerry");
		cache.put(3, "tom");
		// cache.invalidateAll();
		System.out.println(cache);

	}

}
