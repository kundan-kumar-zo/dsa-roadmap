package org.problem.roadmap.hashing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*
146. LRU Cache
https://leetcode.com/problems/lru-cache/

-----------------------Solution-------------------------------
HashMap stores key → value for O(1) lookup.
LinkedList (used as queue) tracks access order: front = LRU, back = MRU.

get(key): return value if present; move key to back (most recently used).
put(key, value): update existing key and move to back; otherwise evict front
if at capacity, then insert new key at back.

reArrange removes key from queue and re-offers it to mark as recently used.

Time: O(1) average get/put (HashMap); queue remove is O(capacity) in this impl.
Space: O(capacity)
*/
class LRUCache {

    Map<Integer, Integer> cache;
    Queue<Integer> ll;
    int cap;

    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        ll = new LinkedList<>();
        cap = capacity;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            reArrange(key); // mark as most recently used
            return cache.get(key);
        }
        return -1;
    }

    private void reArrange(final int key) {
        ll.remove(key);
        ll.offer(key); // move to back (MRU)
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.put(key, value);
            reArrange(key);
            return;
        }
        if (cache.size() >= cap) {
            int last = ll.poll(); // evict LRU from front
            cache.remove(last);
        }
        ll.offer(key);
        cache.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */