## My approach to solving the Sales Tax Question was the design by interface approach. 
Classes implementing an interface are packaged together with other supporting classes 
to help carry out specific tasks. This allows for easy extensibility, reduces dependency 
and also allows anyone fairly new to the program modify it relatively easy.
It also allows for teams to work independently on horizontal sides of the interface in parallel.

## Interfaces:
Product – a product being bought extended by CartItem to add Quantity and Price.
ShoppingCart – products being bought are stored here as CartItems 
Checkout- where a cart is brought for their products to be scanned. Here and only here is 
the tax calculated and returned as a double with the receipt
Calculator- calculates the taxes and total for products being checked out.

## Unit Test:
Unit test was performed for every interface implemented. To effectively test each interface, 
stubs and mock objects (mocking needed classes or objects) were created. This prevents each 
method being tested from calling external classes, as this would not be a proper unit test 
but more of an integration test.

<pre>[Mockito] (http://code.google.com/p/mockito/) was used to create mock objects for unit testing.
(needs to be added to your build path in your IDE if you want to run it from an IDE)</pre>

## Build:
Final unit Tests and the final JAR file are created using ant builder. 

To build and run the package, go to the project base directory (were the build.xml file is) and run ant <br />
`>>$ ant`<br />
It will run all the Unit tests, build the classes and create a JAR file SalesTax.jar and print out instructions on how and where to run the jar file.

## To Run:
`>>$ cd jar`
<br />
`>>$ java –jar SalesTax.jar`

## Other Files:
UML designs are in the Base Directory/UML; it is broken down from package relationship, to relationships between the Interfaces
to relationships within the interfaces (for interfaces with more than one class) and finally to one with all the classes
