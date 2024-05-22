package com.courier.factory;

import com.courier.comps.BlueDart;
import com.courier.comps.DTDC;
import com.courier.comps.Flipkart;
import com.courier.comps.ICourier;

public class FlipkartFactory {

    //static  factory method
    public static Flipkart getInstance(String courierType) {
        // create one of the dependent class obj based on the given courier tyoe
        ICourier courier = null;
        if (courierType.equalsIgnoreCase("dtdc"))
            courier = new DTDC();
        else if (courierType.equalsIgnoreCase("bDart"))
            courier = new BlueDart();
        else
            throw new IllegalArgumentException("Invalid courier type");
        //create the target class object
        Flipkart fpkt = new Flipkart();
        fpkt.setCourier(courier);  //assiging the dependent to target
        return fpkt;

    }

}
