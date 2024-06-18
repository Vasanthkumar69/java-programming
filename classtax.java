public class Tax {
    
    public static void main(String[] args) {
        double income = 250000; 
        double tax = 0; 
        if (income > 500000) {
            tax += (income - 250000) * 0.1; 
            income -= 250000;
        } else {
            tax += (income - 250000) * 0.1;
            income = 0;
        }
        
        if (income > 500000) {
            tax += (income - 500000) * 0.2;
            income -= 500000;
        } else if (income > 0) {
            tax += income * 0.2;
            income = 0;
        }
        
        if (income > 0) {
            tax += income * 0.3; 
        }
        
        System.out.println("Tax for income of Rs." + String.format("%.2f", 250000) + " is Rs." + String.format("%.2f", tax));
    }
}