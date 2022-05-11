package Name;

import javax.swing.*;

public class Ingresso {
    private int value = 50;


    public void ImprimeValor(int value){
        JOptionPane.showMessageDialog("O valor do ingresso e "+ value);
    }
    public void setvalue(int value){
        this.value = value;
    }
    public void getvalue(){
        this.value = value;
    }

}
