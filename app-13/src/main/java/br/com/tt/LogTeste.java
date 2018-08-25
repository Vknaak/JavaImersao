package br.com.tt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTeste {

	private static final Logger LOGGER = LogManager.getLogger(LogTeste.class.getName());

	public static void main(String[] args) {
		System.out.println("Iniciando Teste de Log ....");

		LOGGER.debug("Debug da fun��o.");
		LOGGER.info("Info da fun��o.");
		LOGGER.error("Error da fun��o.");
		LOGGER.fatal("Fatal da fun��o.");
		LOGGER.warn("Warning da fun��o.");

	}

}
