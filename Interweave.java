package stuff;

import java.util.ArrayList;


public class Interweave {
			
		public static void main(String[]args)
		{
			
			ArrayList<Integer>a1=new ArrayList();
			ArrayList<Integer>a2=new ArrayList();
			
			//add any number of elements to first arraylist
			a1.add(5);
			a1.add(6);
			a1.add(54);
			a1.add(10);
			
			
			
			
			//prints first arraylist
			System.out.print("Array 1: ");
			for(int i=0;i<a1.size();i++)
			{
				System.out.print(a1.get(i)+ " ");
			}
			System.out.println("");
			
			//adds any number of elements to second arraylist
			a2.add(10);
			a2.add(11);
			a2.add(12);
			a2.add(13);
			
		
			//prints second arraylist
			System.out.print("Array 2: ");
			for(int i=0;i<a2.size();i++)
			{
				System.out.print(a2.get(i)+ " ");
			}
			System.out.println("");
			
			
			interweave(a1,a2);
			
			for(int i=0;i<a1.size();i++)  
			{
				System.out.print(a1.get(i)+"  ");
			}
		}
		
		public static void interweave(ArrayList<Integer>a1,ArrayList<Integer>a2)
		{
			
			if(a1.size()<a2.size())
			{
				int index2=0;
				
				for(int i=1;i<a1.size();i+=2)
				{
					a1.add(i,a2.get(index2)); //first arraylist has elements of second arraylist in every other index
					index2++;
					
				}
				while(index2!=a2.size())
			{
				a1.add(a2.get(index2)); //the rest of arraylist 2 is printed because arraylist has a smaller size
				index2++;
			}
			}
			
			else  //this works when arraylists have equal size, or when first arraylist is larger
			{ 
				int index1=1;
			
				for(int i=0;i<a2.size();i++)
				{
					a1.add(index1,a2.get(i)); //elements of arraylist 2 are added in every other index of arraylist 1
					index1+=2;
					
				}
			}
		}
			
	}




