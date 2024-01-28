package com.thiago.ligaapp.api.br;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.thiago.ligaapp.api.br.model.Liga;
import com.thiago.ligaapp.api.br.repository.LigaRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	@Bean
	CommandLineRunner initDatabase(LigaRepository ligaRepository) {
		return args -> {
			ligaRepository.deleteAll();
			
			
			Liga l = new Liga();
			l.setEmblema("https://s.sde.globo.com/media/organizations/2021/01/21/pain-e-sports-65-37406.png");
			l.setName("PAIN");
			l.setPontos(2);
			
			ligaRepository.save(l);
			
			Liga l2 = new Liga();
			l2.setEmblema("https://s.sde.globo.com/media/organizations/2021/01/21/loud-e-sports-65-37409.png");
			l2.setName("LOUD");
			l2.setPontos(2);
			
			ligaRepository.save(l2);
			
			Liga l3 = new Liga();
			l3.setEmblema("https://s.sde.globo.com/media/organizations/2022/12/16/los-grandes-65-57619.png");
			l3.setName("LOS GRANDES");
			l3.setPontos(1);
			
			ligaRepository.save(l3);
			
			Liga l4 = new Liga();
			l4.setEmblema("https://s.sde.globo.com/media/organizations/2021/01/21/red-canids-e-sports-65-37403.png");
			l4.setName("RED CANIDS");
			l4.setPontos(2);
			
			ligaRepository.save(l4);
			
			Liga l5 = new Liga();
			l5.setEmblema("https://s.sde.globo.com/media/organizations/2022/12/16/fluxo-65-57620.png");
			l5.setName("FLUXO");
			l5.setPontos(1);
			
			ligaRepository.save(l5);
			
			Liga l6 = new Liga();
			l6.setEmblema("https://s.sde.globo.com/media/organizations/2021/01/21/furia-e-sports-65-37418.png");
			l6.setName("FURIA");
			l6.setPontos(1);
			
			ligaRepository.save(l6);
			
			Liga l7 = new Liga();
			l7.setEmblema("https://s.sde.globo.com/media/organizations/2021/01/21/intz-e-sports-65-37415.png");
			l7.setName("INTZ");
			l7.setPontos(1);
			
			ligaRepository.save(l7);
			
			Liga l8 = new Liga();
			l8.setEmblema("https://s.sde.globo.com/media/organizations/2021/01/21/kabum-e-sports-65-37412.png");
			l8.setName("KaBuM!");
			l8.setPontos(2);
			
			ligaRepository.save(l8);
			
			Liga l9 = new Liga();
			l9.setEmblema("https://s.sde.globo.com/media/organizations/2022/12/16/vivo-keyd-65-57623.png");
			l9.setName("Vivo Keyd");
			l9.setPontos(2);
			
			ligaRepository.save(l9);
			
			Liga l10 = new Liga();
			l10.setEmblema("https://s.sde.globo.com/media/organizations/2022/01/12/65-liberty-havan.png");
			l10.setName("Liberty");
			l10.setPontos(1);
			
			ligaRepository.save(l10);
		};
	}

}
