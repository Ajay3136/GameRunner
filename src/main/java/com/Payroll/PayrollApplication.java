package com.Payroll;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Payroll.game.GameRunner;
import com.Payroll.game.MarioGame;
import com.Payroll.game.PacmanGame;
import com.Payroll.game.SuperContraGame;

@SpringBootApplication
public class PayrollApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PayrollApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		PacmanGame game = new PacmanGame();
//		GameRunner gameRunner = new GameRunner(game);
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.run();
	}

}
