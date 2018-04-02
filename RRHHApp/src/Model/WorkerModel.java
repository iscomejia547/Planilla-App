/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Objects.Worker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Sistema30
 */
public class WorkerModel {
    private List<Worker> workers;

    public WorkerModel() {
        workers=new ArrayList<>();
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public boolean add(Worker t){
        return workers.add(t);
    }
    
    public boolean update(Worker t){
        if(t==null){
            return false;
        }
        int index=byIDindex(t.getId());
        if(index<=-1){
            return false;
        }
        workers.set(index, t);
        return true;
    }
    public boolean delete(Worker t){
        if(t==null){
            return false;
        }
        int index=byIDindex(t.getId());
        if(index<=-1){
            return false;
        }
        workers.remove(index);
        return true;
    }
    private int byIDindex(int id){
        Collections.sort(workers, (Worker o, Worker o1)->o.getId()-o1.getId());
        int index=Collections.binarySearch(workers,new Worker(id, null, null, null, null, null, Worker.NIVEL_ACADEMICO.Máster, 0.0f),
                (Worker o, Worker o1)->o.getId()-o1.getId());
        return index;
    }
    public Worker byID(int id){
        return workers.get(byIDindex(id));
    }
}
