package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //test çalıştırıcı notasyonu
@CucumberOptions(  // Seneryoların nerede ve nasıl çalışacağı,hangi raporu kullanılmasıyla alakalı seçenekleri ayarlar
        plugin = {"html:src/test/resources/reports/report.html"},
        features = "src/test/resources/features", // features'ın yolunu belirmemiz gerekir
        glue = "stepdefinitions",// Kodlarımızı yazdığımız yeri belirtiriz
       tags = "@g2", // @g1 or @g2 or @g3 or @g4\", //Çalıştırmak istediğimiz seneryoya verdiğimiz tag'i belirtiriz
        dryRun = false // Seneryonun adımlarını kontrol eder ve çalıştığını görürüz
)



public class Runner1 {
}
