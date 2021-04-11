/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nailun Najah
 */
public class QueueData {
    public class QueueData extends VehicleMerk {
    private final Queue<VehicleMerk> merk = new LinkedList<>();
    private final Queue<VehicleMerk> merk = new LinkedList<VehicleMerk>();

    QueueData(){

    }

    public void addData(VehicleMerk merk){
        this.merk.add(merk);
    public boolean addData(VehicleMerk merk){
        return this.merk.add(merk);
    }

    public void removeData(VehicleMerk merk){
        this.merk.remove(merk);
    public boolean removeData(VehicleMerk merk){
        return this.merk.remove(merk);
    }

    public void fetchData(){
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdata;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdata;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdata;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
             System.out.println(merk.element().getMerk());
        };
    }
    public void size(){
        VehicleMerk head = this.merk.peek();
        System.out.println("head of queue-"
                           + head);
         int size = merk.size();
        System.out.println("Size of queue-"
                           + size);
    }
    public void pollData(){
        VehicleMerk peekmerk = this.merk.poll();
        System.out.println("Poll Queue : "+peekmerk.getMerk());
          
         for (int i = 0; i < merk.size(); i++) {;
          
         for (int i = 0; i < merk.size(); i++) {;
          
         for (int i = 0; i < merk.size(); i++) {;
}