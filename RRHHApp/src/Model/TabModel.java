/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Objects.Worker;
import java.util.List;

/**
 *
 * @author Sistema30
 */
public class TabModel {
    public Object[][] toMatrix(List<Worker> t){
        Object[][] matrix=new Object[t.size()][t.get(0).toArray().length];
        int i=0;
        for (Worker x: t) {
            matrix[i]=x.toArray();
            i++;
        }
        return matrix;
    }
}
