/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Produce;
import java.util.ArrayList;
/**
 *
 * @author nehap
 */
public class ProduceDirectory {
    private ArrayList<Produce> produceArray;
    
    public ProduceDirectory(){
        produceArray = new ArrayList();
    }

    public ArrayList<Produce> getProduceArray() {
        return produceArray;
    }

    public void setProduceArray(ArrayList<Produce> produceArray) {
        this.produceArray = produceArray;
    }

   
    public Produce newProduce(String prodName, double price, int quantity){
        Produce produce = new Produce(prodName, price, quantity);
        produceArray.add(produce);
        return produce;
    }
    
    public void removeProduce(Produce produce){
        produceArray.remove(produce);
    }
}
