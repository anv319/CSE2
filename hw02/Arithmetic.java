//Anthony Varshavskiy
//HW02
//CSE2-111
//Arithmetic Program

//define a class for Arithmetic
public class Arithmetic {
    
    //main method for this Java program
    public static void main(String[] args) {
                
        int nSocks=3; //Number of pairs of socks
        double sockCost$=2.58; //Cost per pair of socks; '$' is part of variable
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=3.25; //Cost per box of envelopes
        double taxPercent=0.06; //PA state sales Tax
        double totalSockCost$=nSocks*sockCost$; //Total cost of socks
        double taxSocks=totalSockCost$*taxPercent*100; //Sales tax for the socks
        double totalGlassesCost$=nGlasses*glassCost$; //Total cost of glasses
        double taxGlasses=totalGlassesCost$*taxPercent*100; //Sales tax for the glasses
        double totalEnvelopesCost$=nEnvelopes*envelopeCost$; //Total cost of envelopes
        double taxEnvelopes=totalEnvelopesCost$*taxPercent*100; //Sales tax for the envelopes
        double totalPurchaseCost=totalSockCost$+totalGlassesCost$+totalEnvelopesCost$; //Total cost of purchase before tax
        double totalSalesTax=taxSocks+taxGlasses+taxEnvelopes; //Total sales tax for all items
        
        //Convert tax values to a smaller decimal value
        double taxSocks$=(int)(taxSocks)/100.0; 
        double taxGlasses$=(int)(taxGlasses)/100.0;
        double taxEnvelopes$=(int)(taxEnvelopes)/100.0;
        double totalSalesTax$=(int)(totalSalesTax)/100.0;
        
        //Total cost of purchases after sales tax
        double taxPurchaseCost=totalPurchaseCost+totalSalesTax$;
        
        //Print item being bought, # of item(s), and cost per item
        System.out.println("Item: Socks");
        System.out.println("Amount: "+nSocks+" pairs");
        System.out.println("Cost per pair: $"+sockCost$);
        
        System.out.println("Item: Glasses");
        System.out.println("Amount: "+nGlasses);
        System.out.println("Cost per glass: $"+glassCost$);
        
        System.out.println("Item: Envelopes");
        System.out.println("Amount: "+nEnvelopes);
        System.out.println("Cost per envelope: $"+envelopeCost$);
        
        //Print total cost of each item and sales tax for that item
        System.out.println("Total Cost for Socks: $"+totalSockCost$);
        System.out.println("Sales Tax for Socks: $"+taxSocks$);
        System.out.println("Total Cost for Glasses: $"+totalGlassesCost$);
        System.out.println("Sales Tax for Glasses: $"+taxGlasses$);
        System.out.println("Total Cost for Envelopes: $"+totalEnvelopesCost$);
        System.out.println("Sales Tax for Envelopes: $"+taxEnvelopes$);
        
        //Print total cost of purchases before tax, total sales tax, and total cost of purchases after tax
        System.out.println("Total Cost of Purchases before Tax: $"+totalPurchaseCost);
        System.out.println("Total Sales Tax: $"+totalSalesTax$);
        System.out.println("Total Cost of Purchases after Tax: $"+taxPurchaseCost);
    }
}