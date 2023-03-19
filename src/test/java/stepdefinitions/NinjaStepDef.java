package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.NinjaPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NinjaStepDef {
    
    NinjaPage ninjaPage = new NinjaPage();
    ArrayList<String> telefonisim=new ArrayList<>();
    ArrayList<String> sepettekiisimler = new ArrayList<>();
    
    
    @When("kullanici phone sayfasina gider")
    public void kullaniciPhoneSayfasinaGider() {
        ninjaPage.phoneButton.click();
        
    }

    @Then("telefonlarin marka adini alir")
    public void telefonlarinMarkaAdiniAlir() {
        for (WebElement w:ninjaPage.phones) {
            System.out.println(w.getText());
            telefonisim.add(w.getText());

        }
    }

    @Then("tum ogeleri sepete ekle")
    public void tumOgeleriSepeteEkle() {
        for (WebElement w:ninjaPage.sepetler) {
            w.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Then("sepete tikla")
    public void sepeteTikla() {
        ninjaPage.cartButton.click();
    }

    @Then("sepetteki isimleri al")
    public void sepettekiIsimleriAl() {
        for (WebElement w:ninjaPage.namesOfCart) {
            System.out.println(w.getText());
            sepettekiisimler.add(w.getText());
        }
    }

    @Then("sepetteki ve sayfadaki listeleri karsilastir")
    public void sepettekiVeSayfadakiListeleriKarsilastir() {
        Collections.sort(sepettekiisimler);
        Collections.sort(telefonisim);
        Assert.assertEquals(sepettekiisimler,telefonisim);
    }
}
