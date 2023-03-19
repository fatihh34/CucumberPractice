package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    /*
     Senaryolar arasındaki bağlantıyı sağlayan glue yapısına koyduğumuz stepdefinition package'i içerisinde
    @before ve @after gibi bir notasyon varsa extends testbase dememize gerek kalmadan her senaryodan önce veya
    sonra bu methodlar çalışacaktır
     Cucumber'da @before, @after kullanma ihtiyacımız olursa bunu hooks class'ına koyarız.
     */
    @Before("@g1")
            public void setup1(){
        System.out.println("Amazonda iphone aramasi yapildi");
    }
    @Before("@g2")
    public void setup2(){
        System.out.println("Amazonda selenium aramasi yapildi");
    }
    @Before("@g3")
    public void setup3(){
        System.out.println("Amazonda java aramasi yapidi");
    }
    @Before("@g4")
    public void setup4(){
        System.out.println("Browser kapatildi");
    }

//    @After
//    public void tearDown(Scenario scenario) { //Scenario tipinde bir parametre ataması yapılır
//        final byte[] screenshot;
//        //final -> bir değişkenin değerinin değiştirilemez olduğunu belirtir
//        //byte[]-> bir byte dizisi tanımlar. Byte dizeleri, sıralı veri depolama ve işleme işlemleri için
//        //kullanılır.Verilerin depolanması, iletilmesi ve okunması için kullanılan çeşitli dosya türleri,
//        //resimler ve diğer verileri saklamak için kullanılır.
//    }
}
