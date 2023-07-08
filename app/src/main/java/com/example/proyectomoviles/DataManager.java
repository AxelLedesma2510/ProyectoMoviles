package com.example.proyectomoviles;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static DataManager instance;
    private List<DataChangeListener> listeners = new ArrayList<>();

    private DataManager() {
        // Constructor privado para evitar instancias directas
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public void registerDataChangeListener(DataChangeListener listener) {
        listeners.add(listener);
    }

    public void unregisterDataChangeListener(DataChangeListener listener) {
        listeners.remove(listener);
    }

    public void notifyDataChanged() {
        for (DataChangeListener listener : listeners) {
            listener.onDataChanged();
        }
    }
}

