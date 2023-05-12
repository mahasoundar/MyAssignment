package wwek3.day1assignment;

public class Automation extends MultipleLanguage implements Language, TestTool  {
	
          
    public void Java() {
		System.out.println("Java");
	}
    public void ruby() {
		System.out.println("Ruby");
	}
    public void python() {
    	
		System.out.println("Python");
	}
    public static void main(String[] args) {
    	
		Automation obj=new Automation();
		obj.Selenium();
		obj.Java();
		obj.ruby();
		obj.python();
	}
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
		
	}

		}


