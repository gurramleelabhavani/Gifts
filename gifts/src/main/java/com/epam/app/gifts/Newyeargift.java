package com.epam.app.gifts;

public class Newyeargift extends Sweets implements Chocolates
{


		public static void main(String[] args)
{
	int []chocowt=new int[3];
	int wtgift;

	Sweets Halwa=new Sweets();
	Chocolates silk=new Newyeargift();
	chocowt[0]=silk.ChocolatesWeight(19,6);
	wtgift=chocowt[0]+Halwa.Sweetswt(21,7);
	System.out.println("The total gift-one weight is:"+wtgift);
	
	Sweets Laddu=new Sweets();
	Chocolates Kitkat= (Chocolates) new Newyeargift();
	chocowt[1]=Kitkat.ChocolatesWeight(36,5);
	wtgift=chocowt[1]+Laddu.Sweetswt(25,30);
	System.out.println("The total gift-two weight is:"+wtgift);
	
	Sweets Keer=new Sweets();
	Chocolates Oreo= (Chocolates) new Newyeargift();
	chocowt[2]=Oreo.ChocolatesWeight(8,20);
	wtgift=chocowt[2]+Keer.Sweetswt(18,16);
	System.out.println("The total gift-three weight is:"+wtgift);
	
	for(int i=0;i<chocowt.length;i++)
	{
		for(int j=i+1;j<chocowt.length;j++)
		{
			if(chocowt[i]>chocowt[j])
			{
				int p=chocowt[i];
				chocowt[i]=chocowt[j];
				chocowt[j]=p;
			}
		}
	}
	System.out.println("Chocolates in the gifts the order is:");
	for(int k=0;k<chocowt.length;k++)
	{
		System.out.println(chocowt[k]);
	}
	System.out.println();
}
	public int ChocolatesWeight(int i,int i1) {
		return(i*i1);
	}

}
