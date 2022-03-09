package com.sotatek.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
