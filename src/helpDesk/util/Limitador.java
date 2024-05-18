package helpDesk.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Limitador extends PlainDocument{
    
    public enum TipoEntrada{
        NUMERO, TEXTO, 
    }
    
    private int limite;
    private TipoEntrada tpEntrada;

    public Limitador(int limite, TipoEntrada tpEntrada) {
        this.limite = limite;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        
        //Teste para fechar o metodo quando o limite é atingido
        if (string == null || getLength() == limite){
            return;
        }
        
        //Variavel para armazer a quantidade de caracteres
        int totalCarac = getLength() + string.length();
        
        //Filtro de quais caracteres usar
        String regex = "";
        switch(tpEntrada){
            case NUMERO: regex = "[^0-9]"; break;
            case TEXTO: regex = "[^\\p{IsLatin}@.,\\-_%][^0-9]"; break;
        }
        
        // Substituindo por vazios
        string = string.replaceAll(regex, "");
        
        if(totalCarac <= limite){
            super.insertString(i, string, as);
        }else{
            String nova = string.substring(0, limite);
            super.insertString(i, nova, as);
        }
    }
    
    
    
}
