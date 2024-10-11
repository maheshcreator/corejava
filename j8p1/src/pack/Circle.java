package pack;

public class Circle {
	int rad;
	float pi=3.14F;
	
	void input(int r)
	{
		rad=r;
	}

	float area()
	{
		float area=pi*rad*rad;
		return area;
	}
	float peri()
	{
		float perim=2*pi*rad;
		return perim;
	}
}
