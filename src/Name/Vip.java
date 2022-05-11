package Name;

import javax.swing.*;

public class Vip extends Ingresso{
    private String vip ;
    //@override
    public vip Ingresso(){
        JOptionPane.showMessageDialog("O valor do ingresso vip e "+ vip);
    }
    public void setVip(String vip){
        this.vip = vip;
    }
    public void getVip(){
        return vip;
    }
}
