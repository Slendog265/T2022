package dol;

public class MRU{

	double d, v, t;
	
	public MRU(double d, double v, double t) 
	{
		this.d = d;
		this.t = t;
		this.v = v;
	}
	
	
	public void Distance(Double d)
	{
		this.d = d;
	}
	
	public double ResulDist()
	{
		return d;
	}
	
	public void Velocity(Double v)
	{
		this.v = v;
	}
	
	public double ResultVelo()
	{
		return v;
	}
	
	public void time(double t)
	{
		this.t = t;
	}
	
	public double ResultTime()
	{
		return t;
	}
	
}
