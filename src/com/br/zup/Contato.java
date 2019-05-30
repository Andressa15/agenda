package com.br.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contato {
	public static void main(String[] args) {
		
	
			Scanner scan = new Scanner(System.in);
	
		System.out.println(" Informe um numero conforme o desejado: "
				+ "\n"+"(1) Criar um contato"
				+ "\n"+"(2) Buscar telefone");
				
		int usuario = scan.nextInt();

if ( usuario == 1) {
				Scanner entrada = new Scanner (System.in);
				System.out.println("qual nome??");
				String nome = entrada.next();


				System.out.println(" qual e o teu telefone?");
				Long telefone = entrada.nextLong();

				Map<String, Long> example = new HashMap<String, Long>();
				example.put(  nome, telefone);
				example.put(  "Michael", telefone);
				example.put(  "Vinicius", telefone);
			
		
				
					System.out.println("Qual nome vc procura?");
				String nome1 = scan.next();
				
			
				
				
				System.out.println(example.containsKey(nome1));


				System.out.println(example.get(nome1));
			}

		}
	
}




