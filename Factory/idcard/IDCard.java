package idcard;

import framework.Product;

public class IDCard extends Product
{
	private String owner;
	
	IDCard(String owner)
	{
		System.out.println(owner + "'s id card has been created");
		this.owner = owner;
	}
	
	@Override
	public void use()
	{
		System.out.println(owner + "'s card has been used");
	}
	
	@Override
	public String toString()
	{
		return "[IDCard:" + owner + "]"; 
	}
	
	public String getOwner()
	{
		return owner;
	}
}
