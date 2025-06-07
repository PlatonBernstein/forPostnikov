package classes.hardware;

import classes.auxiliaries.Proportions;
import classes.production.ProductionMarkings;

public class Frame {
    private Proportions proportions;
    private String color;
    private ProductionMarkings productionMarkings;
    private Port[] ports;
    private float mass;
    private String material;
    private String coatingMaterial;


    public Frame(Proportions proportions, String color, ProductionMarkings productionMarkings, Port[] ports, float mass, String material, String coatingMaterial) {
        this.proportions = proportions;
        this.color = color;
        this.productionMarkings = productionMarkings;
        this.ports = ports;
        this.mass = mass;
        this.material = material;
        this.coatingMaterial = coatingMaterial;
    }

    public Proportions getProportions() {
        return proportions;
    }

    public void setProportions(Proportions proportions) {
        this.proportions = proportions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ProductionMarkings getProductionMarkings() {
        return productionMarkings;
    }

    public void setProductionMarkings(ProductionMarkings productionMarkings) {
        this.productionMarkings = productionMarkings;
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
        return "Frame characteristics: frame proportions: " + proportions.toString().substring(16) +
                "; frame production markings: " + productionMarkings.toString() +
                "; number of ports - " + this.ports.length +
                ", color of the frame - " + this.color +
                ", material of making - " + this.material +
                ", material of coating - " + this.coatingMaterial +
                ", mass of frame - " + this.mass;
    }
}
