package vn.edu.iuh.fit;

import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.backend.entities.Address;
import vn.edu.iuh.fit.backend.entities.Candidate;
import vn.edu.iuh.fit.backend.repository.AddressRepository;
import vn.edu.iuh.fit.backend.repository.CandidateRepository;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class Week07LabTranTuanKiet21011961Application {

    public static void main(String[] args) {
        SpringApplication.run(Week07LabTranTuanKiet21011961Application.class, args);
    }
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Bean
    CommandLineRunner initData(){
        return args -> {
            Random rnd =new Random();
            for (int i = 1; i < 1000; i++) {
                Address add = new Address();
                add.setNumber(rnd.nextInt(1,1000)+"");
                add.setStreet("Quang Trung");
                add.setCity("HCM");
                add.setZipcode(rnd.nextInt(70000,80000)+"");
                add.setCountry(CountryCode.getByCode(1));
                addressRepository.save(add);

                Candidate can=new Candidate("Name #"+i,
                        LocalDate.of(1998,rnd.nextInt(1,13),rnd.nextInt(1,29)),
                        add,
                        "email_"+i+"@gmail.com",
                        rnd.nextLong(1111111111L,9999999999L)+"");
                candidateRepository.save(can);
                System.out.println("Added: " +can);
            }
        };
    }
}
