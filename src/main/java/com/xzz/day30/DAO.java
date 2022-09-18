package com.xzz.day30;

import java.util.*;

/**
 * @author 徐正洲
 * @create 2022-06-06 15:30
 * <p>
 * DAO:data(base) access object：操作数据库
 */
public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        T t = map.get(id);
        return t;
    }

    public void update(String id, T entity) {
        if (map.containsKey(id)){
            map.put(id, entity);
        }
    }
    public List<T> list() {
        ArrayList<T> ts = new ArrayList<>();
        Collection<T> values = map.values();
        for (T value : values) {
            ts.add(value);
        }
        return ts;
    }

    public void delete(String id) {
        if (map.containsKey(id)){
            map.remove(id);
        }

    }


}
