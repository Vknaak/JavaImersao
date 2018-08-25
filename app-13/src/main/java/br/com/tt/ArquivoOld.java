package br.com.tt;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ArquivoOld {

	public static void main(String[] args) {
		System.out.println("Iniciando o Arquivo..");
		BufferedWriter bw = null;
		try {
			try {
				Path path = Paths.get("escrever.txt");
				bw = Files.newBufferedWriter(path);
				bw.append("ola vilson");

			} finally {
				if (bw != null) {

					bw.close();
				}
			}

		} catch (Exception e) {
			System.err.println("Falha no sistema!!!");
		}

	}
}
