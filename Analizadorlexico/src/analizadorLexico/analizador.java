package analizadorLexico;

class analizador
{
	public static void main(String carls[])
	{	
		Character in[];
		lexer prueba=new lexer();
		prueba.instrucciones();
		in=prueba.leer();
		prueba.esIdentificador(in);
		prueba.esToken(in);
		prueba.esDigito(in);
	
	}
}