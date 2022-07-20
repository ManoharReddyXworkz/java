package com.xworkz.corejava.collections.arraylist.arraylistExamples;


	import java.util.ArrayList;
	import java.util.Iterator;

	public class ArraylistDemo1 {

		public static void main(String[] args) {

			Book classmate = new Book();
			classmate.setBrandName("Classmate");
			classmate.setNoOfPages(100);
			classmate.setPrice(40.00);

			Book aruns = new Book(); 
			aruns.setBrandName("Aruns");
			aruns.setNoOfPages(200);
			aruns.setPrice(60.00);

			ArrayList<Book> books = new ArrayList<Book>();
			books.add(classmate);
			books.add(aruns);

			System.out.println(books);

			for(int i = 0; i<books.size();i++) {
				if(books.get(i).getNoOfPages() == 200) {
					System.out.println(books.get(i));
				}
			}

			Iterator<Book> itr = books.iterator();

			while(itr.hasNext()) {
				Book book = itr.next();
				if(book.getNoOfPages() == 100) {
					System.out.println(book);
				}
			}
		}

	}

