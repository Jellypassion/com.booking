package com.booking.structure.common;

/**
 * Created by HillelMono7 on 9/11/2017.
 */
public enum  EnvironmentProperty {

    BOOKING_STORIES;

    public String readProperty() {
        return PropertiesController.getProperty(getPropertyName());
    }

    public String getPropertyName() {
        return name().toLowerCase().replaceAll("_", ".");//мавен не понимает символ "_". для этого заменяем на "."
    }

}
