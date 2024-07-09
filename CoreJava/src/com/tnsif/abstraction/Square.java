package com.tnsif.abstraction;

public class Square extends Shape
{
	private float side;
	public Square()//default
	{
		side=2.0f;
	}
	public Square(float side)//parameter
	{
		this.side=side;
	}
	@Override
	void calarea() {
		super.area=side*side;
		// TODO Auto-generated method stub
		
	}
	

}
