package com.baseurak.AwesomeGreat;

import com.baseurak.AwesomeGreat.member.MemberRepository;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AwesomeGreatApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AwesomeGreatApplication.class, args);
		MemberRepository memberRepository = context.getBean(MemberRepository.class);

	}

}
