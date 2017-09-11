package jbehave.steps;

import com.booking.structure.core.pages.HotelsSearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class HotelsSearchPageSteps extends ScenarioSteps {

    private HotelsSearchPage hotelsSearchPage;

    private final static String DATE_SEPARATOR = ",";

    public HotelsSearchPageSteps(final Pages pages) {
        super(pages);
        hotelsSearchPage = getPages().getPage(HotelsSearchPage.class);
    }

    @Step
    public void openPage() {
        //WebDriverUtil.openPage(hotelsSearchPageSteps);
        hotelsSearchPage.openAt("booking.com");
    }

}
