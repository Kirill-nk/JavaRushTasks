package com.javarush.task.task15.task1514;

class ListAdapter implements BetaList {
    private AlphaList list;

    ListAdapter(AlphaList list) {
        this.list = list;
    }

    int getValue(int index) {
        return this.list.get(index);
    }

    void setValue(int index, int value) {
        this.list.set(index, value);
    }

    int getSize() {
        return this.list.count();
    }

    void setSize(int newSize) {
        if (newSize > this.list.count()) {
            while (this.list.count() < newSize) {
                this.list.add(null);
            }
        } else if (newSize < this.list.count()) {
            while (this.list.count() > newSize) {
                list.remove(list.count() - 1);
            }
        }
    }
}
