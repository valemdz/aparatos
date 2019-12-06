package com.vale.proyecto;

import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AparatosApplication implements CommandLineRunner {
	
	private final static Logger logger = LoggerFactory.getLogger(AparatosApplication.class);

	public static void main(String[] args) {
		logger.info("Mensaje Antes");
		SpringApplication.run(AparatosApplication.class, args);
		logger.info("Mensaje Despues");
		System.setProperty("java.awt.headless", "false"); 
		JOptionPane.showMessageDialog(null, "Javadesde0.com");
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Mensaje Run");
		
	}

}
