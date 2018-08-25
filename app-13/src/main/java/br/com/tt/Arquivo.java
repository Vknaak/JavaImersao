package br.com.tt;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import javax.swing.JOptionPane;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Arquivo {
	
	private static final Logger LOGGER = LogManager.getLogger(Arquivo.class.getName());

	public static void main(String[] args)  {
		System.out.println("Sistema Arquivo");
		Path path = Paths.get("escrever2.txt");
		// try resource auto closeable
		try (BufferedWriter bw = Files.newBufferedWriter(path)) {

			bw.write(" Realizando try resource auto closeable");
		} catch (IOException e) {
			String codigo = UUID.randomUUID().toString();
			String msg = "Falha ao escrever o arquivo, cod: "+ codigo;
			String stackTrace = ExceptionUtils.getStackTrace(e);
			LOGGER.error(msg + " " + stackTrace);
			System.err.println(msg);
			JOptionPane.showMessageDialog(null, msg);
			
		}catch (Exception e) {
			String codigo = UUID.randomUUID().toString();
			String msg = "Falha no Sistema, cod: "+ codigo;
			String stackTrace = ExceptionUtils.getStackTrace(e);
			LOGGER.error(msg + " " + stackTrace);
			System.err.println(msg);
			JOptionPane.showMessageDialog(null, msg);
			
		}
	}

}
