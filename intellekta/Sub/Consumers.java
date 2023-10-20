package com.intellekta.Sub;

import java.util.HashSet;
import java.util.List;

public class Consumers {

    private List<Consumer> consumerList;
    HashSet<Consumer> map;

    public Consumers(List<Consumer>[] consumerList) {
        for (int i = 0; i < consumerList.length; i ++) {
            map.addAll((consumerList[i]));
        }
    }
    public Consumers() {
    }
    public void addConsumer(Consumer consumer) {
        consumerList.add(consumer);
    }
    public List<Consumer> getConsumers() {
        map.add((Consumer) consumerList);
        return consumerList;
    }
}
