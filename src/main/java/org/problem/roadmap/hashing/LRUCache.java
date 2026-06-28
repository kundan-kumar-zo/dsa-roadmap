package org.problem.roadmap.hashing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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
            reArrange(key);
            return cache.get(key);
        }
        return -1;
    }

    private void reArrange(final int key) {
        ll.remove(key);
        ll.offer(key);
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.put(key, value);
            reArrange(key);
            return;
        }
        if (cache.size() >= cap) {
            int last = ll.poll();
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