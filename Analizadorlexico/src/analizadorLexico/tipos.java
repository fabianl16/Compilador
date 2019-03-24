package analizadorLexico;

class tipos
{
	private int cont;
	private String tipo;
	private String cualesSon;

	public tipos(int cont,String tipo,String cualesSon)
	{
		setCont(cont);
		setTipo(tipo);
		setCualesSon(cualesSon);	
	}
	public void setCont(int cont)
	{
		this.cont=cont;
	}

	public void setTipo(String tipo)
	{
		this.tipo=tipo;
	}
	public void setCualesSon(String cualesSon)
	{
		this.cualesSon=cualesSon;
	}

	public int getCont()
	{
		return cont;
	}

	public String getTipo()
	{
		return tipo;
	}
	public String getCualesSon()
	{
		return cualesSon;
	}


	public void verTipos()
	{
		System.out.println("Los " + getTipo() + " son " + getCont() + " '"+getCualesSon()+"'");
	}
}