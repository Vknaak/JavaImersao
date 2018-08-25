package br.com.tt.Exception;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.tt.LogTeste;

public class SistemaException extends Exception {

	private static final Logger LOGGER = LogManager.getLogger(SistemaException.class.getName());

	public SistemaException(String message, Throwable cause) {
		super(message, cause);
		String stacktrace = ExceptionUtils.getStackTrace(cause);
		LOGGER.error(message + " Exception: " + stacktrace);

	}

	public SistemaException(String message) {
		super(message);
		LOGGER.error(message);

	}

	public SistemaException(Throwable cause) {
		super(cause);
		String stacktrace = ExceptionUtils.getStackTrace(cause);
		LOGGER.error(" Exception: " + stacktrace);
	}

}
