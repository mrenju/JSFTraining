
import java.io.Serializable;
import java.util.LinkedHashMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

/*
 * To access the properties set in Register.xhtml page.
 */

/**
 *
 * @author renm
 */
@ManagedBean
@SessionScoped
public class RegistrationBean implements Serializable{
    private String name;
    private String password;
    private boolean gender;
    private String[] experience;
    private String email;
    private String country;
    private String city;
    private static int[] days={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
    private static String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    private static int[] year={2020,2019,2018,2017,2016,2015,2014,2013,2012,2011,2010,2009,2008,2007,2006,2005,2004,2003,2002,2001,2000,1999,1998,1997,1996,1995,1994,1993,1992,1991,1990,1989,1988,1987,1986,1985,1984,1983,1982,1981,1980,1979,1978,1977,1976,1975,1974,1973,1972,1971,1970,1969,1968,1967,1966,1965,1964,1963,1962,1961,1960,1959,1958,1957,1956,1955,1954,1953,1952,1951,1950,1949,1948,1947,1946,1945,1944,1943,1942,1941,1940,1939,1938,1937,1936,1935,1934,1933,1932,1931,1930,1929,1928,1927,1926,1925,1924,1923,1922,1921,1920,1919,1918,1917,1916,1915,1914,1913,1912,1911,1910,1909,1908,1907,1906,1905,1904,1903,1902,1901,1900};
    private static String[] countries = {"India","UK","New Zealand","US","China"};
    private static String[] indianCities = {"Bangalore","Kochi","Mumbai","Chennai"};
    private static String[] ukCities = {"London","Birmingham","Glasgow","Liverpool"};
    private static String[] chinaCities = {"Beijing","Shanghai","Hong Kong","Wuhan"};
    private static String[] usCities = {"New York","Los Angeles","Chicago","Houston"};
    private static String[] nzCities = {"Auckland","Wellington","Hamilton","Hastings"};
    
    public int[] getDays() {
        return this.days;
    }
    
    public String[] getMonths() {
        return this.months;
    }
    
    public int[] getYear() {
        return this.year;
    }
    
    public String[] getUkCities() {
        return this.ukCities;
    }

    public String[] getIndianCities() {
        return this.indianCities;
    }
  
    public String[] getChinaCities() {
        return this.chinaCities;
    }
    
    public String[] getUsCities() {
        return this.usCities;
    }
    
    public  String[] getNzCities() {
        return this.nzCities;
    }
    public String[] getAllCountries() {
        return this.countries;
    }
    
    public void countryChanged(ValueChangeEvent e) {
        this.country = e.getNewValue().toString();
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String[] getExperience() {
        return experience;
    }

    public void setExperience(String[] experience) {
        this.experience = experience;
    }   
}
