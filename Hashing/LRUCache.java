package Hashing;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRUCache {

    private Map<Integer, Integer>  cache = new HashMap<>();
    private List<Integer> cacheOrder  = new ArrayList<>();
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheOrder = new ArrayList<>();
        this.cache =  new HashMap<>();
    }

    public int get(int key){
       if(!cache.containsKey(key))
        return -1;

       cacheOrder.remove(Integer.valueOf(key));
       cacheOrder.add(key);

       return cache.get(key);
    }

    public void put(int key , int value){

        if(cache.containsKey(key)){
            cache.put(key, value);
            cacheOrder.remove(Integer.valueOf(key));
            cacheOrder.add(key);

            return;
        }

       if(cache.size() >= capacity){
           int lruKey = cacheOrder.get(0);
           cacheOrder.remove(0);
           cache.remove(lruKey);
       }
        cache.put(key, value);
        cacheOrder.add(key);
    }
    public static void main(String[] args) {

        LRUCache lru2 = new LRUCache(2);
        lru2.put(1, 1);
        lru2.put(2, 2);
        lru2.get(1);       // 1 becomes MRU
        lru2.put(1, 100);  // update existing key
        lru2.put(3, 3);    // should evict key 2

        System.out.println(lru2.get(1));  // expected 100
        System.out.println(lru2.get(2));  // expected -1 (should be evicted)
        System.out.println(lru2.get(3));
    }
}
