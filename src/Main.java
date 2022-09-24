//import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Abstract sınıflarla çalışma dersi
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new WomanGameCalculator();

    }
}







        //overriding dersi

        //OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        //System.out.println(ogretmenKrediManager.hesapla(1000));

      //  BaseKrediManager[] krediManagers = new BaseKrediManager[]
        //        {new OgretmenKrediManager(), new TarımKrediManager()};

        //for (BaseKrediManager krediManager : krediManagers ) {
         //System.out.println(krediManager.hesapla(1000));
        //}






        // EmaılLogger Logger = new EmaılLogger();
        // Logger.Log("Log mesajı");

        //CustomerManager customerManager = new CustomerManager(new FıleLogger());
        //customerManager.Add();











                //inheritanceDemo
        //KrediUI krediUI = new KrediUI();
        //krediUI.KrediHesapla(new OgretmenKrediManager());



      /*  Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager(); */



















        //creditManager creditManager = new creditManager();
      //  creditManager.add();
        //creditManager.calculate();

      //  mortgageManager mortgageManager = new mortgageManager();
       // mortgageManager.add();

        //creditManager[]credits = new creditManager[3];

   /*     ArrayList<String> sehirler = new ArrayList<String>();

        ArrayList<creditManager> credits= new ArrayList<creditManager>();
        credits.add(new mortgageManager());
        credits.add(new vehicleManager());
        credits.add(new officerManager());

        // for(int i=0 ; i<credits.length ; i++)

        for(creditManager credit : credits) {
            credit.calculate(); }
    }
} */

//SOLID yazılıma yeni ürün gelirse kodların değişmemesi lazım