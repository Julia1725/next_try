package ru.study.julia.firstproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.study.julia.firstproject2.model.classes;

@SpringBootApplication
public class Firstproject2Application {

	public static void main(String[] args) {
		SpringApplication.run(Firstproject2Application.class, args);
	}

	Client client1 = new Client(setId(25), setMobile("56712"), setSiebelId("abdc"));

	Client client2 = new Client(57, "abcd", "56712");

	System.out.println(cleint1, client2)

}
