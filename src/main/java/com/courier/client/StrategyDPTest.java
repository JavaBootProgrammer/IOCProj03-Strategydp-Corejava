package com.courier.client;

import com.courier.comps.Flipkart;
import com.courier.factory.FlipkartFactory;

public class StrategyDPTest {
    public static void main(String[] args) {
        Flipkart fpkt = FlipkartFactory.getInstance("bDart");
        String resultMsg = fpkt.shopping(new String[]{"shirt", "trouser"}, new double[]{2000.0, 5000.0});
        System.out.println(resultMsg);

    }
}
