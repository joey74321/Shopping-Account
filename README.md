# Shopping-Account
Demonstrate the functionality and features using a command-line interface.

Each customer has unique id and is linked to exactly one account. 
Account owns shopping cart and orders. 
Customer could register as a web user to be able to buy items online. 
Customer is not required to be a web user because purchases could also be made by phone or by ordering from catalogues. 
Web user has login name which also serves as unique id. 
Web user could be in several states - new, active, temporary blocked, or banned, and be linked to a shopping cart. 
Shopping cart belongs to account. 
Account owns customer orders. 
Customer may have no orders. 
Customer orders are sorted and unique. 
Each order could refer to several payments, possibly none. 
Every payment has unique id and is related to exactly one account.
Each order has current order status. 
Both order and shopping cart have line items linked to a specific product. 
Each line item is related to exactly one product. 
A product could be associated to many line items or no item at all.


Provide Black Box test cases for ALL features of the implementation. 
Provide White Box testing for at least one of the class objects. Provide coverage for all methods of the object. You may use Junit or another automated test generation technique. You may also provide a written test procedure or create a source code test case by hand. The While Box testing should cover the functionality of at least one of the class objects in the system. Normally, you would create them for all but that is not required for this assignment. Select one approach manual or automated since you are not required to do both.

