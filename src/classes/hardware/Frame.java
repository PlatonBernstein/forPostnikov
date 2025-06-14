package classes.hardware;

import classes.auxiliaries.Size;
import classes.production.ProductionLabel;

public class Frame {
    private Size size;
    private String color;
    private ProductionLabel productionLabel;
    private Port[] ports;
    private float mass;
    private String material;
    private String coatingMaterial;


    public Frame(Size size, String color, ProductionLabel productionLabel, Port[] ports, float mass, String material, String coatingMaterial) {
        this.size = size;
        this.color = color;
        this.productionLabel = productionLabel;
        this.ports = ports;
        this.mass = mass;
        this.material = material;
        this.coatingMaterial = coatingMaterial;
    }

    public Size getProportions() {
        return size;
    }

    public void setProportions(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ProductionLabel getProductionMarkings() {
        return productionLabel;
    }

    public void setProductionMarkings(ProductionLabel productionLabel) {
        this.productionLabel = productionLabel;
    }

    public Port[] getPorts() {
        return ports;
    }

    public void setPorts(Port[] ports) {
        this.ports = ports;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCoatingMaterial() {
        return coatingMaterial;
    }

    public void setCoatingMaterial(String coatingMaterial) {
        this.coatingMaterial = coatingMaterial;
    }

    @Override
    public String toString() {
        return "Frame characteristics: frame proportions: " + size.toString().substring(16) +
                "; frame production markings: " + productionLabel.toString() +
                "; number of ports - " + this.ports.length +
                ", color of the frame - " + this.color +
                ", material of making - " + this.material +
                ", material of coating - " + this.coatingMaterial +
                ", mass of frame - " + this.mass;
    }
}
