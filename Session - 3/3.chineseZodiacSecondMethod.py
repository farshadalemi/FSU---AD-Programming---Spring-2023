# write a program in Python called chineseZodiac.py to calculate the Chinese Zodiac for a given user input as a year number.
"""+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
File: chineseZodiac.py | Assignment 3
Instructor: Nguyen Thai
Date: 2/17/2023
Student: Farshad Alemi
Description: 
write a program in Python called chineseZodiac.py to calculate
the Chinese Zodiac for a given user input as a year number.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"""

# ////////////////////// Second Method \\\\\\\\\\\\\\\\\\\\\\\\\

inputNumber = int(input('Please enter a natral number (< or = 12)\n'))
# I asked user to enter a number and change the typr of input from String to Intiger.

if(inputNumber > 0 & inputNumber <= 12):

    yearName = ["Monkey", "Roster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"]
    calculatorName = yearName[inputNumber % 12]
    print('Year ', inputNumber,' is ',calculatorName)

else:
    print(" ❌ Input is Invalid! Please try again. ")
