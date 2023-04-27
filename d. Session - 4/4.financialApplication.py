"""+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
File: chineseZodiac.py | Assignment 4
Instructor: Nguyen Thai
Date: 2/28/2023
Student: Farshad Alemi
Description: 
write a program in Python called financialApplication.py to calculate 
the amount of money earned on a CD based on the user's inputs.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"""

# Input Section
purchaseValue = float(input("Enter CD's purchase value ($): ", ) )
#I did a typecasting on "purchaseValue" to have it as float number instead of integer.
while purchaseValue < 0:
    print("Negative value is not allowed, Try again!")
    purchaseValue = float(input("Enter CD's purchase value ($): ", ) )
else:
    yieldInPercentage = float(input("Enter CD's annual percentage yield (%): ", ) )
    while yieldInPercentage < 0:
        print("Negative percentage is not allowed, Try again!")
        yieldInPercentage = float(input("Enter CD's annual percentage yield (%): ", ) )
    else:
        investmentTerm = int(input("Enter CD's investment term (months): ", ))
        while investmentTerm < 0:
            print("Negative investment term is not possible, Try again!")
            investmentTerm = int(input("Enter CD's investment term (months): ", ))
            

# Calculation Section
termVal = purchaseValue
yieldInPercentage = yieldInPercentage /100
for x in range(investmentTerm): 
    termVal +=  termVal * yieldInPercentage/12
    #I also reduce the number of decimal utilizing print formating
    termValFinal = "{:.2f}".format(termVal)

# Output Section       
print("Your CD is worth $", termValFinal, "at the end of the", investmentTerm ,"months term")



