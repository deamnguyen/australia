package com.sotatek.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sotatek.common.Suburb;

public class SuburbRepository {
    private List<Suburb> suburbs;
    
    public SuburbRepository() {
    	suburbs = new ArrayList<>(); 
    }
    
    public SuburbRepository(List<Suburb> suburbs) {
    	this.suburbs = suburbs;
    }
    
    public void add(Suburb suburb) {
    	this.suburbs.add(suburb);
    }
    
    public void addAll(List<Suburb> suburbs) {
    	this.suburbs.addAll(suburbs);
    }
    
    public List<Suburb> getAll() {
    	return suburbs;
    }
    
    public List<Suburb> getByPostcode(String postcode) {
    	return suburbs.stream()
    			.filter(suburb -> suburb.getPostcode().equals(postcode))
    		    .collect(Collectors.toList());
    }
    
    public void sort(List<Suburb> suburbs) {
    	Collections.sort(suburbs, new Comparator<Suburb>() {
            @Override
            public int compare(Suburb suburbOne, Suburb suburbTwo) {
                return ((Suburb)suburbOne).getName()
                        .compareTo(((Suburb)suburbTwo).getName());
            }
        }); 
    }
    
    public void sort() {
    	Collections.sort(suburbs, new Comparator<Suburb>() {
            @Override
            public int compare(Suburb suburbOne, Suburb suburbTwo) {
                return ((Suburb)suburbOne).getName()
                        .compareTo(((Suburb)suburbTwo).getName());
            }
        }); 
    }
}
