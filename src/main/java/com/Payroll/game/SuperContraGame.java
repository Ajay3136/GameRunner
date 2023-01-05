package com.Payroll.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("SuperContra Jump");
	}
	
	public void down() {
		System.out.println("SuperContra Down");
	}
	
	public void right() {
		System.out.println("SuperContra Right");
	}
	
	public void left() {
		System.out.println("SuperContra Left");
	}

}
