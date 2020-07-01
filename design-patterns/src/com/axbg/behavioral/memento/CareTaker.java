package com.axbg.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

class CareTaker {

    List<Memento> versions;

    CareTaker() {
        this.versions = new ArrayList<>();
    }

    void saveMemento(Memento memento) {
        this.versions.add(memento);
    }

    Memento getMemento(int index) {
        if (index >= 0 && index < versions.size()) {
            return versions.get(index);
        }

        return null;
    }
}
