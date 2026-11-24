package com.mycompany.proyecto1poo;
public class MaterialFisico extends Material{
    private float quantity;
    public MaterialFisico() {
    }
    public MaterialFisico(char materialType, float quantity) {
    }

    public MaterialFisico(String key) {
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
        return super.toString()+"MaterialFisico{" + "quantity=" + quantity + '}';
    }
    
}
