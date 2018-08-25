package br.com.tt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTeste {

	private static final Logger LOGGER = LogManager.getLogger(LogTeste.class.getName());

	public static void main(String[] args) {
		System.out.println("Iniciando Teste de Log ....");

		LOGGER.debug("Debug da função.");
		LOGGER.info("Info da função.");
		LOGGER.error("Error da função.");
		LOGGER.fatal("Fatal da função.");
		LOGGER.warn("Warning da função.");

	}

}
