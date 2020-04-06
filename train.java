public class train {

	public static double total = 0;
	
	
	public static void main(String args[]) {
		
		double distance = 740;
		double tank = 500;
		travel(distance,tank);
		System.out.println(total);   
	}     

	public static void travel(double distance, double tank) {
			double difference = distance - tank;
			if (difference * 3 > tank)
			{
				travel(difference * 3,tank);
				double fresh = getTotal() + tank;
				setTotal(fresh);
				System.out.println(difference);
			}
			else
			{
			System.out.println(difference);
			double fresh = getTotal() + difference * 3 + tank;
			setTotal(fresh);
			}

			
	}

	public static void setTotal(double fresh) {
		total = fresh;
	}
	
	public static double getTotal()
	{
		return total;
	}
	
	
}
