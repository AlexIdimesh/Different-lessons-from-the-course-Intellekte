package com.intellekta.Sub;

import java.util.*;

public class Installer implements Subsystem {
    private String name;
    private int version;

    LinkedList<Subsystem> queue = new LinkedList<>(); // итоговая
    ArrayList<Subsystem> endPoint = new ArrayList<>(); // первая в цепочки
    ArrayList<Subsystem> fullList = new ArrayList<>(); // полный список
    Subsystem[] prerequisites;
    boolean isOk;

    public Queue<Subsystem> setUpPlan() {
        fillList(queue, this);
        return queue;
    }

    public boolean fillList(List<Subsystem> currentList, Subsystem current) {
        fillList(new ArrayList<>(), this);
        currentList.add(current);
        for (int i = 0; i < currentList.toArray().length; i ++) {
            currentList.get(current.getVersion());
        }
        if (current.getPrerequisites()!= null) {
            isOk = true;
        } else {
            isOk = false;
        }
        if (current.getPrerequisites().length == 0) {
            endPoint.add(current);
        }
        for (int i = 0; i < current.getPrerequisites().length; i ++) {
            if (prerequisites != null) {
                if (!fullList.contains(current.getPrerequisites()[i])) {
                    fullList.add(current.getPrerequisites()[i]);
                    queue.add(current);
                }
            }
                if (current.getPrerequisites()[i] == null) {
                    isOk = false;
                }
                if (fullList.contains(current.getPrerequisites()[i])) {
                    queue.add(current.getPrerequisites()[i]);
                }
                if (currentList.contains(current.getPrerequisites()[i])) {
                    isOk = false;
                } else {
                    fillList(currentList, current.getPrerequisites()[i]);
                }
                currentList.remove(currentList.size() - 1);
            }
        return isOk;
    }

    public void setUp(Queue<Subsystem> prerequisites) {
        if (prerequisites == null) {
            System.out.println("SetUp plan calculation failed. Wrong prerequisite description at "
                    + getName() + " " + getVersion());
        }
        for (Subsystem queue: prerequisites) {
            queue.install();
        }

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getVersion() {
        return this.version;
    }

    @Override
    public void install() {
        System.out.println(getName() + "version " + getVersion() + "installed successfully");
    }

    @Override
    public Subsystem[] getPrerequisites() {
        return prerequisites;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
