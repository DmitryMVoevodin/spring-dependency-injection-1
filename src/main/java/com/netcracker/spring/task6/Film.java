package com.netcracker.spring.task6;

public class Film {

    private int id;
    private String title;
    private String gener;
    private String country;
    private int year;
    private double profitFromSales;

    public Film() {
        //
    }

    public Film(int id, String title, String gener, String country, int year, double profitFromSales) {
        this.id = id;
        this.title = title;
        this.gener = gener;
        this.country = country;
        this.year = year;
        this.profitFromSales = profitFromSales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getProfitFromSales() {
        return profitFromSales;
    }

    public void setProfitFromSales(double profitFromSales) {
        this.profitFromSales = profitFromSales;
    }

    @Override
    public String toString() {
        return ("Film [id=" + id + "; title=" + title + "; gener=" + gener +
                "; country=" + country + "; year=" + year + "; profit_from_sales=" + profitFromSales + "]");
    }
}
