/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author student
 */

class bank{
    int roi;
    void getRateofInterest(){
        System.out.println("ROI = "+ roi +"%");
    }
}

class icici extends bank{
  icici(){
  roi = 7;
  }
  void getRateofInterest(){
        System.out.println("ROI = "+ roi +"%");
    }
}
class sbi extends bank{
  sbi(){
  roi = 8;
  }
  void getRateofInterest(){
        System.out.println("ROI = "+ roi +"%");
    }
}

class axis extends bank{
  axis(){
  roi = 9;
  }
  void getRateofInterest(){
        System.out.println("ROI = "+ roi +"%");
    }
}


public class ROI {
    public static void main(String args[]){
        icici i = new icici();
        sbi s = new sbi();
        axis a = new axis();
        i.getRateofInterest();
        s.getRateofInterest();
        a.getRateofInterest();
    }
}
