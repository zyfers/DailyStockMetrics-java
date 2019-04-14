package com.bfm.app;

import com.bfm.app.model.Stock;
import com.bfm.app.repositories.StockRepository;
import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.TreeMap;

@SpringBootApplication
@EnableIgniteRepositories
public class StockMain {

    private static StockRepository repository;

    public static void main(String args[]){
        ApplicationContext ctx =  SpringApplication.run(StockMain.class, args);
        repository = ctx.getBean(StockRepository.class);
        populateRepository();
    }

    private static void populateRepository() {
        TreeMap<Long, Stock> stock = new TreeMap<Long, Stock>();
        stock.put(1L, new Stock(1L, "INE032A01023", "BOMBAY DYEING & MFG.CO.LTD.", 114.85, 117.25, 113.5, 115.6, 1198L, 321.6, 82.35));
        stock.put(2L, new Stock(2L, "INE016A01026", "DABUR INDIA LTD.", 434.35, 434.35, 422.05, 422.56, 1127L, 434.35, 312.45));
        stock.put(3L, new Stock(3L, "INE094A01015", "HINDUSTAN PETROLEUM CORPORATION LTD.", 253.25, 253.25, 252.4, 256.35, 1451L, 434.9, 163.45));
        stock.put(4L, new Stock(4L, "INE233A01035", "GODREJ INDUSTRIES LTD.", 547.1, 553.0, 540.1, 543.25, 484L, 656.9, 434.1));
        stock.put(5L, new Stock(5L, "INE009A01021", "INFOSYS LTD.", 661.0, 667.0, 654.3, 664.65, 3999L, 1467.0, 600.65));
        stock.put(6L, new Stock(6L, "INE716A01013", "WHIRLPOOL OF INDIA LTD.", 1421.95, 1422.0, 1390.0, 1406.3, 322L, 1858.85, 1248.0));
        stock.put(7L, new Stock(7L, "INE285B01017", "SPICEJET LTD.", 91.0, 91.5, 89.7, 90.25, 5906L, 91.5, 60.6));
        stock.put(8L, new Stock(8L, "INE002A01018", "RELIANCE INDUSTRIES LTD.", 1126.0, 1130.0, 1111.55, 1121.35, 178L, 1328.75, 872.1));
        stock.put(9L, new Stock(9L, "INE786A01032", "JK LAKSHMI CEMENT LTD.", 294.0, 319.8, 239.6, 311.05, 702L, 484.0, 249.55));
        stock.put(10L, new Stock(10L, "INE081A01012", "TATA STEEL LTD.", 522.05, 524.05, 513.8, 515.55, 4405L, 792.55, 486.9));
        stock.put(11L, new Stock(11L, "INE176A01028", "BATA INDIA LTD.", 1137.55, 1137.55, 1120.0, 1127.35, 525L, 1145.8, 1120.0));
        stock.put(12L, new Stock(12L, "INE062A01020", "STATE BANK OF INDIA", 297.0, 300.15, 293.8, 299.35, 9574L, 334.5, 232.0));
        stock.put(13L, new Stock(13L, "INE158A01026", "HERO MOTOCORP LTD. ", 3097.50, 3135.0, 3057.20, 3128.70, 1308L, 3862.0, 2648.7));
        stock.put(14L, new Stock(14L, "INE217B01036", "KAJARIA CERAMICS LTD.", 495.05, 496.0, 491.25, 493.75, 305L, 763.9, 491.25));
        stock.put(15L, new Stock(15L, "INE175A01038", "JAIN IRRIGATION SYSTEMS LTD.", 70.1, 70.1, 68.45, 69.05, 828L, 150.4, 55.1));
        stock.put(16L, new Stock(16L, "INE237A01028", "KOTAK MAHINDRA BANK LTD.", 1251.15, 1256.30, 1242.85, 1251.35, 1467L, 1424.0, 992.5));
        stock.put(17L, new Stock(17L, "INE326A01037", "LUPIN LTD.", 853.0, 853.0, 840.1, 842.3, 1294L, 986.0, 723.55));
        stock.put(18L, new Stock(18L,"INE883A01011", "MRF LTD.", 66940.75, 67198.90, 66525.85, 66785.80, 89L, 81423.0, 59494.6));
        stock.put(19L, new Stock(19L, "INE205A01025", "VEDANTA LTD.", 202.7, 202.95, 200.6, 202.15, 2113L, 355.7, 190.05));
        stock.put(20L, new Stock(20L, "INE161A01038", "NIIT LTD.", 87.25, 87.3, 85.65, 86.05, 417L, 125.0, 85.65));
        repository.save(stock);
    }
}
