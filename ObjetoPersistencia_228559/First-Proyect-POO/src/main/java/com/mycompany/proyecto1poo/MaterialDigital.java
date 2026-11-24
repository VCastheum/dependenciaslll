package com.mycompany.proyecto1poo;
public class MaterialDigital extends Material{
    private float quantity;
    public MaterialDigital() {
    }
    public MaterialDigital(char materialType, float quantity) {
    }

    public MaterialDigital(String key) {
        super(key);
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString()+"MaterialDigital{" + "quantity=" + quantity + '}';
    }
    
}
