package analizadorLexico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class lexer
{
	
/*************************************************
Clase que nos permite hacer las operaciones de eva
luacion de nuestras expresiones
*************************************************/

	/*****************************************
	Nuestros operadores en un Arreglo de la cla
	se Character
	******************************************/
	private Character tokens[]=  
		{
		'=','(',')','+','-','*','/',';','<','>'
		};
	/***********************
	Variable Auxiliar de 
	Clase Character para
	comprobar si es digito 
	e identificador
	**********************/
	private	Character au='x';

	/*********************************
	intrucciones
	*********************************/
	public void instrucciones()
	{	
		System.out.println("**********************************************************");
		System.out.print("Bienvenido!!                                            *\n");
		System.out.print("Por favor Introduce las Expresiones que desees          *\n");
		System.out.print("Cuando Termines Pulsa Barra Espaciadora y Enter         *\n");
		System.out.println("**********************************************************");
		System.out.println();
	}

	public Character[] leer()
	{
		String res="";
		int longitud=0;
		Character ch[];
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("Introduce la Expresion: ");
			do{
			res+=in.readLine();
			}while(!res.endsWith(" "));
		}catch(IOException ioe)
		{
			System.out.println("Ocurrio la Sig. Excepcion " +ioe);
		}
		longitud=res.length();
		ch=new Character[longitud];
		for(int i=0;i<longitud;i++)
		{
			ch[i]=res.charAt(i);
		}
	return ch;
	}

	/******************************************
	Verificamos la Expresion para ver si es un
	digito con el metodo de la clase Character
	isDigit()
	******************************************/

	public void esDigito(Character ch[])
	{
		int cont=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			if(au.isDigit(ch[i]))
			{
				cont++;
				cualesSon+=ch[i].toString() + " ";
			}
		}
	tipos out=new tipos(cont,"Digitos",cualesSon);
	out.verTipos();
	}

	/******************************************
	Verificamos la Expresion para ver si es un
	operador evaluandolo contra nuestros tokens
	******************************************/

	public void esToken(Character ch[])
	{
		int ope=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<tokens.length;j++)
			{
				if(ch[i].equals(tokens[j]))
				{
					ope++;
					cualesSon+=ch[i].toString() + " ";	
				}			
			}
		}
	tipos out=new tipos(ope,"Tokens",cualesSon);
	out.verTipos();
	}

	/*****************************
	Verificamos la Expresion para 
	ver si es un identificador con
	el metodo de la clase Cha
	racter isJavaIdentifierStart
	*****************************/

	public void esIdentificador(Character ch[])
	{
		int Id=0;
		String cualesSon="";
		for(int i=0;i<ch.length;i++)
		{
			if(au.isJavaIdentifierStart(ch[i]))
			{
				Id++;
				cualesSon+=ch[i].toString() + " ";
			}
		}
	tipos out=new tipos(Id,"Identificadores",cualesSon);
	out.verTipos();	
	}

	
	
}