package com.example.activity_02

public class BeerExpert {
    fun getBrands(color: String):List<String>{
        var brands = ArrayList<String>()
        if (color.equals("amber")){
            brands.add("Jack Amber")
            brands.add("Red Moose")
        }
        else{
            brands.add("Jail Pale Ale")
            brands.add("Gout Stout")
        }
        return brands
    }
}