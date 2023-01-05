package com.Payroll.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Down in the hole");
	}
	
	public void right() {
		System.out.println("Turn Right");
	}
	
	public void left() {
		System.out.println("Turn Left");
	}

}
