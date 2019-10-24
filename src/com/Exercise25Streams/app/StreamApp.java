package com.Exercise25Streams.app;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class StreamApp 
{

	public static void main(String[] args)
	{
		//se inicializa los objetos
		File myFile = null;
		FileReader myReader = null;
		BufferedReader myBuffer = null;
		String line="";
		
		try 
		{
			//se le asignan los valores a los objetos
			myFile = new File("D:\\aDocs\\doc1.txt");
			myReader = new FileReader(myFile);
			myBuffer = new BufferedReader(myReader);
			
			//se imprime TODO el texto del documento de texto
			while ((line=myBuffer.readLine())!=null)
			{
				//line = line.toUpperCase(); //opcion para poner el texto en MAYUSCULAS
				//line = line.replace("O", "W"); // opcion para remplazar una letra por otra
				System.out.println(line);
			}
			
			/*
			//se imprime linea por linea del archivo de texto
			line=myBuffer.readLine();
			System.out.println(line);
			line=myBuffer.readLine();
			System.out.println(line);
			*/
	
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			try 
			{
				//se cierra el buffer y se limpian los objetos
				myBuffer.close();
				myReader = null;
				myFile = null;
				
			} 
			
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
			
			
			
		}
		
	}

}
