package classes.production;

public class ProductionMarkings {
    private int yearOfProduction;
    private int yearsOfWarrantyPeriod;
    private String countryOfProduction;
    private Company company;


    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
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

    public ProductionMarkings(int yearOfProduction, String countryOfProduction, Company company, int yearsOfWarrantyPeriod) {
        this.yearOfProduction = yearOfProduction;
        this.yearsOfWarrantyPeriod = yearsOfWarrantyPeriod;
        this.countryOfProduction = countryOfProduction;
        this.company = company;
    }

    @Override
    public String toString() {
        return  "company - " + this.company.toString() +
                ", country of production - " + this.countryOfProduction +
                ", year of production - " + this.yearOfProduction +
                ", warranty period in years - " + this.yearsOfWarrantyPeriod;
    }


}
