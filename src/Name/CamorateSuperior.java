package Name;

import javax.swing.*;

public class CamorateSuperior extends CamaroteInferior {
    private String ValueExtra;

    public void setValueExtra (String ValueExtra){
        this.ValueExtra = ValueExtra
    }
    public void getValueExtra(){
        return ValueExtra;
    }
    public void ImprimeValor(int value){
        JOptionPane.showMessageDialog("O valor do ingresso e "+ value);
    }
    public void ImprimeLocal(){
        JOptionPane.showMessageDialog("Local do ingresos e" + getlloc() "Valor" + getvalue());

    }



}
