package ma.emsi.spring_mvc_thylemeaf;

import ma.emsi.spring_mvc_thylemeaf.entities.Patient;
import ma.emsi.spring_mvc_thylemeaf.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringMvcThylemeafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcThylemeafApplication.class, args);
    }

    //@Bean
    CommandLineRunner start(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null, "Othman", new Date(), false, 203));
            patientRepository.save(new Patient(null, "Aya", new Date(), true, 149));
            patientRepository.save(new Patient(null, "Imrane", new Date(), true, 138));
            patientRepository.save(new Patient(null, "Zaineb", new Date(), false, 378));
            patientRepository.save(new Patient(null, "AYoub", new Date(), true, 125));
        };
    }
}
