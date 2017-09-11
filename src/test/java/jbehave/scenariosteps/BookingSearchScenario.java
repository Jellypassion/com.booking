package jbehave.scenariosteps;

import org.jbehave.core.annotations.Given;

import net.thucydides.core.annotations.Steps;
import jbehave.steps.HotelsSearchPageSteps;

public class BookingSearchScenario {

    @Steps
    private HotelsSearchPageSteps hotelsSearchPageSteps;


    @Given("user has opened 'Booking.com' site")
    public void userOpenedSite() {
        hotelsSearchPageSteps.openPage();
    }


}
