package com.mycompany.proyecto1poo;

import java.util.Objects;

public class Movimiento {
    private String key;
    private String date;
    private boolean process;

    public Movimiento() {
    }

    public Movimiento(String key, String date, boolean process) {
        this.key = key;
        this.date = date;
        this.process = process;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isProcess() {
        return process;
    }

    public void setProcess(boolean process) {
        this.process = process;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movimiento other = (Movimiento) obj;
        if (this.process != other.process) {
            return false;
        }
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        return Objects.equals(this.date, other.date);
    }

    @Override
    public String toString() {
        return "Movimiento{" + "key=" + key + ", date=" + date + ", process=" + process + '}';
    }
    
}
