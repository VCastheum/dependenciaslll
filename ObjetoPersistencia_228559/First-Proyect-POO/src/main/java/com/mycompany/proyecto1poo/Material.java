package com.mycompany.proyecto1poo;

import java.util.Objects;

public class Material {
    private String key;
    private String title;
    private String typeMaterial;
    private String format;
    private float quantity;

    public Material() {
    }

    public Material(String key, String title, String typeMaterial, String format, float quantity) {
        this.key = key;
        this.title = title;
        this.typeMaterial = typeMaterial;
        this.format = format;
        this.quantity = quantity;
    }

    public Material(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypeMaterial() {
        return typeMaterial;
    }

    public void setTypeMaterial(String typeMaterial) {
        this.typeMaterial = typeMaterial;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Material other = (Material) obj;
        if (Float.floatToIntBits(this.quantity) != Float.floatToIntBits(other.quantity)) {
            return false;
        }
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.typeMaterial, other.typeMaterial)) {
            return false;
        }
        return Objects.equals(this.format, other.format);
    }

    @Override
    public String toString() {
        return "Material{" + "key=" + key + ", title=" + title + ", typeMaterial=" + typeMaterial + ", format=" + format + ", quantity=" + quantity + '}';
    }
    
    
}
