package org.accenture.training.day3;

interface ProjectManager{
	void projectScope();

}

interface Client{
	void requirement();
}


class SolutionArch implements ProjectManager,Client{

	@Override
	public void requirement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void projectScope() {
		// TODO Auto-generated method stub
		
	}
	
	public void analysis() {
		System.out.println("SolutionArch class own method");
	}
}

public class MultipleInheritanceInterface {

	public static void main(String[] args) {
		
		ProjectManager pobj = new SolutionArch(); //Dynamic Object
		pobj.projectScope();
		
		Client cobj = new SolutionArch();
		cobj.requirement();
		
		SolutionArch sobj = new SolutionArch();
		sobj.requirement();
		sobj.projectScope();
		sobj.analysis();
	}}
