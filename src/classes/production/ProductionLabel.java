package classes.production;

import java.text.DateFormat;

public class ProductionLabel {
    private DateFormat dateOfProduction;
    private int yearsOfWarrantyPeriod;
    private String countryOfProduction;
    private Company company;

    public DateFormat getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = DateFormat.getTimeInstance(dateOfProduction);
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getYearsOfWarrantyPeriod() {
        return yearsOfWarrantyPeriod;
    }

    public void setYearsOfWarrantyPeriod(int yearsOfWarrantyPeriod) {
        this.yearsOfWarrantyPeriod = yearsOfWarrantyPeriod;
    }

    public ProductionLabel(int dateOfProduction, String countryOfProduction, Company company, int yearsOfWarrantyPeriod) {
        this.dateOfProduction = DateFormat.getTimeInstance(dateOfProduction);
        this.yearsOfWarrantyPeriod = yearsOfWarrantyPeriod;
        this.countryOfProduction = countryOfProduction;
        this.company = company;
    }

    @Override
    public String toString() {
        return  "company - " + this.company.toString() +
                ", country of production - " + this.countryOfProduction +
                ", year of production - " + this.dateOfProduction +
                ", warranty period in years - " + this.yearsOfWarrantyPeriod;
    }
}
