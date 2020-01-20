package home;

import java.util.ArrayList;

public class Factory {

    String factoryName;
    ArrayList countryAvailable;
    ArrayList cities;

    public String getFactoryName(){
        return factoryName;
    }

    public void setFactoryName(String factoryName){
        this.factoryName = factoryName;
    }

    public ArrayList getCountryAvailable(){
        return countryAvailable;
    }

    public void setCountryAvailable(ArrayList countryAvailable){
        this.countryAvailable = countryAvailable;
    }

    public Object getCityName(){
        return cities;
    }

    public void setCityName(ArrayList cities){
        this.cities = cities;
    }


    public Factory(){

    }
}
