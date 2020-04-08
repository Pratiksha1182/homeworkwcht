package uk.org.wcht.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.org.wcht.pages.AccessibilityPage;
import uk.org.wcht.pages.GetInvolvedPage;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;

public class AccessibilityTest extends TestBase {
    HomePage homePage = new HomePage();
    AccessibilityPage accessibilityPage = new AccessibilityPage();
    GetInvolvedPage getInvolvedPage = new GetInvolvedPage();

    @Test
    public void VerifyUserIsAbleToNavigateToAccessibilityPage() {
        homePage.clickOnAccessibilityLink();
        accessibilityPage.mouseHoverOnYourCommunityTab();
        accessibilityPage.mouseHoverOnGetInvolvedAndClick();
        getInvolvedPage.clickOnLightBitesFieldAndSelectElement();
        getInvolvedPage.clickOnMainMenu();
        getInvolvedPage.clickOnAllYouCanEatField();
        getInvolvedPage.clickOnTakeAwayField();
        getInvolvedPage.clickOnYesIWouldLikeToBecomeAMemberCheckBox();
        getInvolvedPage.clickOnYesIWouldLikeToFindOutMoreCheckBox();
        getInvolvedPage.clickOnYesIWouldLikeHelpUsingEmailOrFacebook();
        getInvolvedPage.enterNameInNameTextField();
        getInvolvedPage.enterAddressInAddressTextField();
        getInvolvedPage.enterPostCodeInPostCodeField();
        getInvolvedPage.clickOnHowWouldYouLikeToBeContacted();
        getInvolvedPage.enterEmailAddressOrPhoneNumberTextField();
        getInvolvedPage.clickOnReCaptchaCheckBox();
        getInvolvedPage.clickOnSubmitButton();
    }

}
