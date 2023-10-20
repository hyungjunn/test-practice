package org.example.pracitce_generics;

interface Repository<T> {
    T get(int id);
    void save(T item);
}

class StringRepository implements Repository<String> {

    private String[] data = new String[10];
    @Override
    public String get(int id) {
        return data[id];
    }

    @Override
    public void save(String item) {
        data[0] = item;
    }
}

class IntegerRepository implements Repository<Integer> {

    private Integer[] data = new Integer[10];

    @Override
    public Integer get(int id) {
        return data[id];
    }

    @Override
    public void save(Integer item) {
        data[0] = item;
    }
}
