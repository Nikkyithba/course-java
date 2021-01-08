package com.nikky.javabasics;

public class Ebay {
        public static void main (String[] args){


            Book book1 = new Book("AAAA","Good Food", 20.00,"John Smith" );
            Book book2 = new Book();
            System.out.println("the Product count after book object created: " + Product.count);

            Software soft1= new Software("BBBB","Norton", 60.0, 2.8);
            Software soft2 = new Software();
            System.out.println("the Product count after software object created: " + Product.count);

        }


}

