
import java.beans.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bachphong
 */
public class Test {
    
    public void myFunc(String str) {
        System.out.println(str);
    }
    
    public static void main(String[] args) throws Exception{
        Test h = new Test();
        new Statement(h, "myFunc", new Object[]{"Hello world"}).execute();
    }
}
