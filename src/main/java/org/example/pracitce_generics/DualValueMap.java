package org.example.pracitce_generics;

interface DualValueMap<K1, K2, V> {
    V get(K1 key1, K2 key2);

    void put(K1 key1, K2 key2, V value);
}
