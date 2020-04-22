/*
 Name 			- 		Naman Singh
 PortalID 		- 		176381
 Date 			- 		19/09/2019
 Project Name 	- 		ANT case study 1
 */



package com.ntt.Book_Discount;
public class Book { //class declaration
	int ISBN;
    String bookName;
    String authorName;
    int originalPrice;
    int discountedPrice;
    
    Book(int ISBN,String bookName,String authorName,int originalPrice) //constructor
    {
    	this.ISBN = ISBN;
        this.bookName = bookName;
        this.authorName = authorName;
        this.originalPrice = originalPrice;
    }
    
    int discount(int dis) //calculating discounted price
    {
    	return discountedPrice= this.originalPrice*(100-dis)/100;
    }
    
    void showDetails(int discountPercent) //display book details
    {
        System.out.println("ISBN No: " +ISBN);
        System.out.println("Book Name: " +bookName);
        System.out.println("Author Name: " +authorName);
        System.out.println("Original Price: " +originalPrice);
        System.out.println("You are given "+discountPercent+"% discount."+"\nNew Price: " +discountedPrice);
    }   

	public static void main(String[] args) { //main method declaration
		Book book= new Book(1234,"MindSet","Carol Dweck",350);
		int  discountPercent= 10;
		book.discount(discountPercent);
		book.showDetails(discountPercent);
	}					
}
