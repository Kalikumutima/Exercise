/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testaplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author admin
 */
public class Testaplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.bk.rw");        
        WebElement link, link1,link2;
    
        link =driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal']"));
        link.click();
        
         //First click"Current & Saving"
        link1 =driver.findElement(By.xpath("//*[@id=\"nav\"]/div/div/div[2]/ul[1]/li[2]/a"));
        link1.click();


        //then click the link you want to
        link2 =driver.findElement(By.xpath("//a[@href ='https://www.bk.rw/personal/checking-saving/personal-current']"));
        link2.click();
       /*  try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            "Logger.getLogger(BankOfKigali.class.getName()).log(Level.SEVERE,null,ex)";
        }*/
        driver.quit();


    }
    
}
