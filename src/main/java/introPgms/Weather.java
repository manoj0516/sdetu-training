package introPgms;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperature=65;
		String sunCondition="Sunny";
		
		if (temperature>80)
		{
			
			System.out.println("Its pleasant");
			
		}
		else if ((temperature >60)&&(sunCondition=="Sunny"))
		{
			System.out.println("Its little cooler");
			System.out.println("Its sunny wear hat");
			
		}
		
		else if ((temperature >45)||(sunCondition=="Overcast"))
		{
			
			System.out.println("Its cooler wear sweaters, not sunny");
			
		}
		
		else
		{
			System.out.println("Its a cold day bring sweaters");
		}

	}

}
