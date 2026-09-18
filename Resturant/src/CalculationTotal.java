public class CalculationTotal extends Kiosk { // 상속
    
  
    public int getTotalPrice(int count1, int count2, int countRice, int countWater) {
        int total = (priceMenu1 * count1) 
                  + (priceMenu2 * count2) 
                  + (priceRice * countRice) 
                  + (priceWater * countWater);
        
        return total; 
    }
}