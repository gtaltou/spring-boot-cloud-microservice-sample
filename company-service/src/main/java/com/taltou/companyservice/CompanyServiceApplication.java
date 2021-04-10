package com.taltou.companyservice;

import com.taltou.companyservice.dao.CompanyRepository;
import com.taltou.companyservice.entities.Company;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CompanyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompanyRepository companyRepository) {

        return args -> {
            Stream.of("GOOGLE", "AMAZON", "FACEBOOK", "CDISCOUNT", "TOYOTA").forEach(company -> {
                companyRepository.save(new Company(null, company, 100 + Math.random() * 900));
            });
            companyRepository.findAll().forEach(System.out::println);

        };


    }

}
