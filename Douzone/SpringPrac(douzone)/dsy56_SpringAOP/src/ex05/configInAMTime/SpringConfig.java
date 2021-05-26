package ex05.configInAMTime;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
		
	@Bean
	public Soccer snp() {
		Map<String,String> playerInfo = new HashMap<>();
		playerInfo.put("name", "박지성");
		playerInfo.put("position", "MF");
		playerInfo.put("sports", "축구");
		
		
		
		NewPlayer np = new NewPlayer();
		np.setName(playerInfo.get("name"));
		np.setPosition(playerInfo.get("position"));
		np.setSports(playerInfo.get("sports"));
		Soccer snp=  new Soccer();
		snp.setPlayer(np);
		
		return snp;		
	}

}




