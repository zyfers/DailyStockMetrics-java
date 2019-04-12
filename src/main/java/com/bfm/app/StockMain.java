package com.bfm.app;

import com.bfm.app.model.Stock;
import com.bfm.app.repositories.StockRepository;
import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableIgniteRepositories
public class StockMain {

    private static StockRepository repository;

    public static void main(String args[]){
        ApplicationContext ctx =  SpringApplication.run(StockMain.class, args);
        repository = ctx.getBean(StockRepository.class);
        Stock s1 = new Stock();
        s1.setId(1L); s1.setIsin("INE032A01023"); s1.setCompany("BOMBAY DYEING & MFG.CO.LTD."); s1.setOpen(114.85); s1.setHigh(117.25); s1.setLow(113.5); s1.setClose(115.6); s1.setNumberOfTrades(1198L); s1.setYearlyHigh(321.6); s1.setYearlyLow(82.35);
        repository.save(1L, s1);
        Stock s2 = new Stock();
        s2.setId(2L); s2.setIsin("INE016A01026"); s2.setCompany("DABUR INDIA LTD."); s2.setOpen(434.35); s2.setHigh(434.35); s2.setLow(422.05); s2.setClose(422.56); s2.setNumberOfTrades(1127L); s2.setYearlyHigh(434.35); s2.setYearlyLow(312.45);
        repository.save(2L, s2);
        Stock s3 = new Stock();
        s3.setId(3L); s3.setIsin("INE094A01015"); s3.setCompany("HINDUSTAN PETROLEUM CORPORATION LTD."); s3.setOpen(253.25); s3.setHigh(253.25); s3.setLow(252.4); s3.setClose(256.35); s3.setNumberOfTrades(1451L); s3.setYearlyHigh(434.9); s3.setYearlyLow(163.45);
        repository.save(3L, s3);
        Stock s4 = new Stock();
        s4.setId(4L); s4.setIsin("INE233A01035"); s4.setCompany("GODREJ INDUSTRIES LTD."); s4.setOpen(547.1); s4.setHigh(553.0); s4.setLow(540.1); s4.setClose(543.25); s4.setNumberOfTrades(484L); s4.setYearlyHigh(656.9); s4.setYearlyLow(434.1);
        repository.save(4L, s4);
        Stock s5 = new Stock();
        s5.setId(5L); s5.setIsin("INE009A01021"); s5.setCompany("INFOSYS LTD."); s5.setOpen(661.0); s5.setHigh(667.0); s5.setLow(654.3); s5.setClose(664.65); s5.setNumberOfTrades(3999L); s5.setYearlyHigh(1467.0); s5.setYearlyLow(600.65);
        repository.save(5L, s5);
        Stock s6 = new Stock();
        s6.setId(6L); s6.setIsin("INE716A01013"); s6.setCompany("WHIRLPOOL OF INDIA LTD."); s6.setOpen(1421.95); s6.setHigh(1422.0); s6.setLow(1390.0); s6.setClose(1406.3); s6.setNumberOfTrades(322L); s6.setYearlyHigh(1858.85); s6.setYearlyLow(1248.0);
        repository.save(6L, s6);
        Stock s7 = new Stock();
        s7.setId(7L); s7.setIsin("INE285B01017"); s7.setCompany("SPICEJET LTD."); s7.setOpen(91.0); s7.setHigh(91.5); s7.setLow(89.7); s7.setClose(90.25); s7.setNumberOfTrades(5906L); s7.setYearlyHigh(91.5); s7.setYearlyLow(60.6);
        repository.save(7L, s7);
        Stock s8 = new Stock();
        s8.setId(8L); s8.setIsin("INE002A01018"); s8.setCompany("RELIANCE INDUSTRIES LTD."); s8.setOpen(1126.0); s8.setHigh(1130.0); s8.setLow(1111.55); s8.setClose(1121.35); s8.setNumberOfTrades(6178L); s8.setYearlyHigh(1328.75); s8.setYearlyLow(872.1);
        repository.save(8L, s8);
        Stock s9 = new Stock();
        s9.setId(9L); s9.setIsin("INE786A01032"); s9.setCompany("JK LAKSHMI CEMENT LTD."); s9.setOpen(294.0); s9.setHigh(319.8); s9.setLow(239.6); s9.setClose(311.05); s9.setNumberOfTrades(702L); s9.setYearlyHigh(484.0); s9.setYearlyLow(249.55);
        repository.save(9L, s9);
        Stock s10 = new Stock();
        s10.setId(10L); s10.setIsin("INE081A01012"); s10.setCompany("TATA STEEL LTD."); s10.setOpen(522.05); s10.setHigh(524.05); s10.setLow(513.8); s10.setClose(515.55); s10.setNumberOfTrades(4405L); s10.setYearlyHigh(792.55); s10.setYearlyLow(486.9);
        repository.save(10L, s10);
        Stock s11 = new Stock();
        s11.setId(11L); s11.setIsin("INE176A01028"); s11.setCompany("BATA INDIA LTD."); s11.setOpen(1137.55); s11.setHigh(1137.55); s11.setLow(1120.0); s11.setClose(1127.35); s11.setNumberOfTrades(525L); s11.setYearlyHigh(1145.8); s11.setYearlyLow(1120.0);
        repository.save(11L, s11);
        Stock s12 = new Stock();
        s12.setId(12L); s12.setIsin("INE062A01020"); s12.setCompany("STATE BANK OF INDIA"); s12.setOpen(297.0); s12.setHigh(300.15); s12.setLow(293.8); s12.setClose(299.35); s12.setNumberOfTrades(9574L); s12.setYearlyHigh(334.5); s12.setYearlyLow(232.0);
        repository.save(12L, s12);
        Stock s13 = new Stock();
        s13.setId(13L); s13.setIsin("INE158A01026"); s13.setCompany("HERO MOTOCORP LTD. "); s13.setOpen(3097.50); s13.setHigh(3135.0); s13.setLow(3057.20); s13.setClose(3128.70); s13.setNumberOfTrades(1308L); s13.setYearlyHigh(3862.0); s13.setYearlyLow(2648.7);
        repository.save(13L, s13);
        Stock s14 = new Stock();
        s14.setId(14L); s14.setIsin("INE217B01036"); s14.setCompany("KAJARIA CERAMICS LTD."); s14.setOpen(495.05); s14.setHigh(496.0); s14.setLow(491.25); s14.setClose(493.75); s14.setNumberOfTrades(305L); s14.setYearlyHigh(763.9); s14.setYearlyLow(491.25);
        repository.save(14L, s14);
        Stock s15 = new Stock();
        s15.setId(15L); s15.setIsin("INE175A01038"); s15.setCompany("JAIN IRRIGATION SYSTEMS LTD."); s15.setOpen(70.1); s15.setHigh(70.1); s15.setLow(68.45); s15.setClose(69.05); s15.setNumberOfTrades(828L); s15.setYearlyHigh(150.4); s15.setYearlyLow(55.1);
        repository.save(15L, s15);
        Stock s16 = new Stock();
        s16.setId(16L); s16.setIsin("INE237A01028"); s16.setCompany("KOTAK MAHINDRA BANK LTD."); s16.setOpen(1251.15); s16.setHigh(1256.30); s16.setLow(1242.85); s16.setClose(1251.35); s16.setNumberOfTrades(1467L); s16.setYearlyHigh(1424.0); s16.setYearlyLow(992.5);
        repository.save(16L, s16);
        Stock s17 = new Stock();
        s17.setId(17L); s17.setIsin("INE326A01037"); s17.setCompany("LUPIN LTD."); s17.setOpen(853.0); s17.setHigh(853.0); s17.setLow(840.1); s17.setClose(842.3); s17.setNumberOfTrades(1294L); s17.setYearlyHigh(986.0); s17.setYearlyLow(723.55);
        repository.save(17L, s17);
        Stock s18 = new Stock();
        s18.setId(18L); s18.setIsin("INE883A01011"); s18.setCompany("MRF LTD."); s18.setOpen(66940.75); s18.setHigh(67198.90); s18.setLow(66525.85); s18.setClose(66785.8); s18.setNumberOfTrades(89L); s18.setYearlyHigh(81423.0); s18.setYearlyLow(59494.6);
        repository.save(18L, s18);
        Stock s19 = new Stock();
        s19.setId(19L); s19.setIsin("INE205A01025"); s19.setCompany("VEDANTA LTD."); s19.setOpen(202.7); s19.setHigh(202.95); s19.setLow(200.6); s19.setClose(202.15); s19.setNumberOfTrades(2113L); s19.setYearlyHigh(355.7); s19.setYearlyLow(190.05);
        repository.save(19L, s19);
        Stock s20 = new Stock();
        s20.setId(20L); s20.setIsin("INE161A01038"); s20.setCompany("NIIT LTD."); s20.setOpen(87.25); s20.setHigh(87.3); s20.setLow(85.65); s20.setClose(86.05); s20.setNumberOfTrades(417L); s20.setYearlyHigh(125.0); s20.setYearlyLow(85.65);
        repository.save(20L, s20);
    }
}
