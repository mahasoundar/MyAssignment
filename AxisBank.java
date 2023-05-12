package wwek3.day1assignment;

public class AxisBank extends BankInfo{
	
    @Override
      public void deposit() {
		System.out.println("Deposit");
	}
      public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}
}
