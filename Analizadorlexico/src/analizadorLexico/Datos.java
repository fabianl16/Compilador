package analizadorLexico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Datos {

	private String texto, pr, var, op, num, agr, ind;
    private static String  patrones=("(mas|menos|por|entre|int|float|double)|([a-zA-Z]+)|([>|<|=|+|*|-|/]+)|([0-9]+)|([{|}]+)|(;)");
	public Datos(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getPr() {
		return pr;
	}

	public void setPr(String pr) {
		this.pr = pr;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAgr() {
		return agr;
	}

	public void setAgr(String agr) {
		this.agr = agr;
	}

	public String getInd() {
		return ind;
	}

	public void setInd(String ind) {
		this.ind = ind;
	}

	public void analizar () {
		Pattern p = Pattern.compile(patrones);
        Matcher matcher = p.matcher(texto);
        while (matcher.find()){
        	/*-------------------------------------*/
        	String TokenPR = matcher.group(1);
        	if(TokenPR!=null){
        		   
        		setPr("Palabra reservada: "+TokenPR);
        	}
        	
        	String TokenV = matcher.group(2);
            	if(TokenV !=null){
            		
            		setVar("Variable: "+TokenV);

        	}
            	
            	String TokenOP = matcher.group(3);
            	if(TokenOP !=null){
            		setOp("Operador: "+TokenOP);

        	}
            	String TokenNUM = matcher.group(4);
            	if(TokenNUM !=null){
            		setNum("Numero: "+TokenNUM);

        	}
            	String TokenAG = matcher.group(5);
            	if(TokenAG !=null){
            		setAgr("Agrupadores: "+TokenAG);

        	}
            	String TokenI = matcher.group(6);
            	if(TokenI !=null){
            		setInd("Indicador: "+TokenI);

        	}
            	
        	/*--------------------------------------*/
        }
        
        
	}
	
}
