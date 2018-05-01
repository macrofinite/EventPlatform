/*
 * Copyright (C) 2018 pvanhorn
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eventplatform;

/**
 *
 * @author pvanhorn
 */
public class Location {
    //private final String name;
    private final String streetNo;
    private final String atStreet;
    private final String city;
    private final String state;
    private final String zip;
    private final String country;
    private final String unitNum;
    
    public Location(String streetNumber, String street, String city, String state, String zipCode){
        streetNo = streetNumber;
        atStreet = street;
        this.city = city;
        this.state = state;
        zip = zipCode;
        
        country = "USA";
        unitNum = "";
    }
    
    public Location(String streetNumber, String street, String unit, String city, String state, String zipCode){
        streetNo = streetNumber;
        atStreet = street;
        this.city = city;
        this.state = state;
        zip = zipCode;
        unitNum = unit;
        
        country = "USA";
    }
    
    public Location(String streetNumber, String street, String unit, String city, String state, String zipCode, String country){
        streetNo = streetNumber;
        atStreet = street;
        this.city = city;
        this.state = state;
        zip = zipCode;
        unitNum = unit;
        this.country = country;
    }
    
    public String getAddress(){
        return streetNo + " " + atStreet + " " + unitNum + " " + city + ", " + state + " " + zip + " " + country;
    }
}
