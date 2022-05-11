package Name;

import javax.swing.*;

public class CamaroteInferior extends Vip{
    private String loc;

    public void Setloc(String loc){
        this.loc = loc;
    }
    public void getlloc(){
        return loc;
    }
    public void ImprimeLocal(){
        JOptionPane.showMessageDialog("Local do ingresos e" + getlloc(55) "Valor" + getvalue(55));

    }
}
