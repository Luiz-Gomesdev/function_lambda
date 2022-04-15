package br.com.luiz.consumer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.luiz.consumer.entitie.Product;

public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Sofá", 850));
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		List<String> names = list.stream().map(p -> p.getProduct().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		
//      Forma alternativa que fiz utilizando o forEach com Arrow Function
//		list.forEach(p -> p.setProduct(p.getProduct().toUpperCase()));
//		list.forEach(System.out::println);


	}

}
