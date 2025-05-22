package com.tnsif.streamoperations;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//demo for stream operations  where stream is used to filter the data as per our requirement

public class Demostreamoperations {

	public static void main(String[] args) {
		List<Employee> l= new ArrayList<Employee>();
		l.add(new Employee(101,"swetha",45789.45f));
		l.add(new Employee(102,"manasa",75789.45f));
		l.add(new Employee(103,"akhila",55787.45f));
		l.add(new Employee(104,"sindhu",45889.45f));
		l.add(new Employee(105,"spoorthi",39789.55f));
		l.add(new Employee(106,"srija",75789.35f));
		l.add(new Employee(107,"jeny",65789.75f));
// filtering the data based on salary which is greater than 70000
		Stream<Employee> st=l.stream().filter(sal->sal.esal>70000.00f);
		st.forEach(n->System.out.println("Eid"+n.empid+"Ename"+n.ename));
		
//mapping ( which retrieve the names of employee in upperCase)
		String [] str= {"manasa","srija","jeny"};
		List<String> name=Arrays.asList(str);
		name.stream().map(String::toUpperCase).forEach(System.out::println);
//sort method (sorting the names according to alphabet)
		List<String> names=Arrays.asList(str);
		names.stream().sorted().forEach(System.out::println);
		
		
//reduce (which reduces the list)
		List<Integer> number=Arrays.asList(10,30,40,50);
		int sum=number.stream().reduce(0,Integer::sum);
		System.out.println(sum);
		

	}

}
