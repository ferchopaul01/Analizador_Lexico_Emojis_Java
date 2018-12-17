/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author fer_1
 */
public class AnalisisLexico extends AbstractTableModel {
    public String[] nombreColumna = {"TOKEN","LEXEMA"};
    public Object[][] data;
    public AnalisisLexico(String[] tokens,String[] lexemas)
    {
        data=new Object[tokens.length][2];
        for(int i=0;i<tokens.length;i++){
            data[i][0]=tokens[i];
            data[i][1]=lexemas[i];
        }
    }
    public int getColumnCount(){
        return nombreColumna.length;
    }
    public int getRowCount(){
        return data.length;
    }
    public String getColumnName(int col){
        return nombreColumna[col];
    }
    public Object getValueAt(int row, int col){
        return data[row][col];
    }
}
