package com.org.tav.day3;
class det
{
	int id;
	String name;
	String skill;
	int exp;
	double sal;
	public det(int id,String name,String skill,int exp,int sal)
	{
		super();
		this.id=id;
		this.name=name;
		this.skill=skill;
		this.exp=exp;
		this.sal=sal;
	}
}
public class empl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		det de[]=new det[3];
		de[0]=new det(1, "raju", "java", 2,20000);
		de[1]=new det(2, "harsh", "html", 1,30000);
		de[2]=new det(3, "java", "java", 4,50000);
		System.out.println("display");
		for(int i=0;i<de.length;i++)
		 {
			 System.out.println("id = "+de[i].id+" "+" name= "+de[i].name+" skill= "+de[i].skill+" exp= "+de[i].exp+" sal= "+de[i].sal);
		 }
		for(int j=0;j<3;j++)
		{
			if(de[j].skill=="java")
			{
				de[j].sal=de[j].sal*1.2;
			}
		}
		
		System.out.println("after hike whose expertise is java");
		for(int i=0;i<de.length;i++)
		 {
			 System.out.println("id = "+de[i].id+" "+" name= "+de[i].name+" skill= "+de[i].skill+" exp= "+de[i].exp+" sal= "+de[i].sal);
		 }
		

	}

}
