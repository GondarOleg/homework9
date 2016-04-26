package com.epam.abstractfactory.woodfactory;

import com.epam.abstractfactory.abstractions.Engineer;

/**
 * Created by o.gondar on 26.04.2016.
 */
public class FoodFactoryEngineer implements Engineer {
    public void develop() {
        System.out.println("FoodFactoryEngineer is developing!");
    }
}
