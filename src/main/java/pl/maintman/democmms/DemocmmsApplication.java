package pl.maintman.democmms;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.maintman.democmms.user.User;
import pl.maintman.democmms.user.UserController;
import pl.maintman.democmms.user.UserRepository;
import pl.maintman.democmms.user.UserService;

@SpringBootApplication
public class DemocmmsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemocmmsApplication.class, args);

		SpringApplication application = new SpringApplication(DemocmmsApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);


	}

}
