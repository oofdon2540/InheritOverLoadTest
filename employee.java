/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritoverloadtest;

/**
 *
 * @author Yo
 */
public class employee {
    protected float rate = 300.0f, work=10.f, pay;
    
    public employee(int h){
        pay = h*rate/work;
    }
    
    public employee(int h, float r){
        pay = h*r/work;
    }
    
    public employee(int h, float r, float b){
        this(h,r);
        if(h>100){
            pay += b;
        }
    }
}
