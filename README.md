# May I take your order? 
Opening a new frozen yogurt store. 
This assignment emphasizes conditionalstatements.


You have come up with very unique toppings for frozen yogurt and have decided to open a frozen yogurt shop. To 
streamline the process, you will have kiosks for the customer to enter their order. Your assignment this week is to 
write a program for these kiosks. The kiosk will ask the customer several questions and then tell them the cost of 
their order. Specifically, the program will prompt the user for the following information in this order (the possible 
answers user will input is in parenthesis – you must accept these input values):

• Would you like to order a premium or regular frozen yogurt flavor? (P for premium, R for regular)
• What size would you like? (S for small, M for medium, L for large, X for extra large)

• How many flavors would you like? (a number between 1 and 3)

• How many toppings would you like? (a number between 0 and 6)

• Should this be in a cup of a cone? (U for cup, O for cone)

If they enter cone:
• What type of cone? (S for sugar cone, W for waffle cone)

• What day of the week is this? (Su for Sunday, M for Monday, Tu for Tuesday, W for Wednesday, Th for Thursday, F for Friday, Sa for Saturday)
You can assume the user will only enter legal values. In turn, the program will calculate the cost of the order based 
on the menu below. Then it will output how much the customer owes:

• Your frozen yogurt will cost <price>

Here are additional requirements:
  
• The user might enter upper or lowercase letters. The program should accept either. 
  
• Your program must prompt for the information in the order shown in the examples.
  
• When displaying price, the dollar amount must be in typical U.S. dollar format with no leading zeros and 
exactly 2 significant digits after the decimal. 
  
• The non-numeric input by the user must be represented using named constants. For example, you 
might have a constant variable PREMIUM that is set to “P” or ‘P’ (depending on whether you 
choose to represent it as a string or character) and a constant variable REGULAR set to “R” or ‘R’. 
Likewise you would have a constant SMALL set to “S” or ‘S’, a constant MEDIUM set to “M” or 
‘M’, and so forth for all of the possible input values for all of the prompts. You do not need 
constants to represent the number of flavors or the number of toppings though. 
