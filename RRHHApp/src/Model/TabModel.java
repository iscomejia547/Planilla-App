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
    public Object[][] plan(List<Worker> t, Object[] header){
        Object[][] plan=new Object[t.size()][header.length];
        int i=0;
        for (Worker x:t) {
            float inss=inss(x.getBase_income()*12)/12, ir=ir(x.getBase_income()*12)/12;
            plan[i][0]=x.getId();
            plan[i][1]=x.getNames();
            plan[i][2]=x.getSurname();
            plan[i][3]=x.getNo_inss();
            plan[i][4]=x.getBase_income();
            plan[i][5]=ir;
            plan[i][6]=inss;
            plan[i][7]=x.getBase_income()-ir-inss;
        }
        return plan;
    }
    private float inss(float base){
        return (float)(base*0.0625);
    }
    private float ir(float base){
        if(base<=100000){
            return 0.0f;
        }else if(base>100000 & base <=200000){
            return (float)(base*0.15);
        }else if(base>200000 & base <=350000){
            return (float)(base*0.20+15000);
        }else if(base>350000 & base <=500000){
            return (float)(base*0.25+45000);
        }else if(base>500000){
            return (float)(base*0.3+82500);
        }
        return 0.0f;
    }
}
