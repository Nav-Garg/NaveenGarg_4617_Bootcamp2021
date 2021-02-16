class Bank{
        int getRateOfInterest(){
                return 0;
        }
}

class SBI extends Bank{
        int getRateOfInterest(){
                System.out.println("Branch Address: Delhi");
                return 8;
        }
}

class BOI extends Bank{
        int getRateOfInterest()
        {
                 System.out.println("Branch Address: Mumbai");
                return 7;
        }
}

class ICICI extends Bank{
        int getRateOfInterest(){
		System.out.println("Branch Address: Kolkata");
                return 9;
        }
}

class BankDetail{
        public static void main(String args[]){
                SBI s=new SBI();
                ICICI i=new ICICI();
                BOI b=new BOI();
                System.out.println("SBI Rate of Interest: "+s.getRateOfInterest() +"%"+ "\n");
                System.out.println("BOI Rate of Interest: "+b.getRateOfInterest()+"%"+"\n");
                System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest()+"%"+"\n");
        }
}

