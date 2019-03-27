package analizadorLexico;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class analizadorLexico {

    public static void main(String[] args) {
    	
    	
    	String patrones=("(mas|menos|por|entre)|([a-zA-Z]+)|([>|<|=|+|*|-|/]+)|([0-9]+)|([{|}]+)|(;)|(.|,|'?')"); 
    	String texto =("");
    	System.out.println("ingrese la operacion: ");
    	 Scanner sc = new Scanner(System.in);
    	texto=sc.nextLine();
    	Pattern p = Pattern.compile(patrones);
        Matcher matcher = p.matcher(texto);
        while (matcher.find()){
        	/*-------------------------------------*/
        	String TokenPR = matcher.group(1);
        	if(TokenPR!=null){
        		System.out.println("palabra reservada:"+TokenPR);        	
        	}
        	
        	String TokenV = matcher.group(2);
            	if(TokenV !=null){
            		System.out.println("variable:"+TokenV);
        	}
            	
            	String TokenOP = matcher.group(3);
            	if(TokenOP !=null){
            		System.out.println("operador:"+TokenOP);
        	}	
            	String TokenNUM = matcher.group(4);
            	if(TokenNUM !=null){
            		System.out.println("numero:"+TokenNUM);
        	}
            	String TokenAG = matcher.group(5);
            	if(TokenAG !=null){
            		System.out.println("agrupadores:"+TokenAG);
        	}
            	String TokenI = matcher.group(6);
            	if(TokenI !=null){
            		System.out.println("indicador:"+TokenI);
        	}
            	String TokenE = matcher.group(7);
            	if(TokenE !=null){
            		System.out.println("error caracter no valido:"+TokenE);
        	}
        	/*--------------------------------------*/
        }
    }
}