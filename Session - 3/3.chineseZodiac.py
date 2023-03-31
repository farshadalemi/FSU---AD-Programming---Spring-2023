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

# ////////////////////// First Method \\\\\\\\\\\\\\\\\\\\\\\\\

inputNumber = int(input('Please enter a natral number (< or = 12)\n'))
# I asked user to enter a number and change the typr of input from String to Intiger.

if(inputNumber > 0 & inputNumber <= 12):
    #2print("Input is Valid")
# I check validation of input, then pass it to the main condition which is Chinese Zodiac.
# I also add Emoji characters to make it more visualize.

    if(inputNumber % 12 == 0):
        print('Year', inputNumber, ' is the Monkey. 🐒 ')
    elif(inputNumber % 12 == 1):
        print('Year', inputNumber, ' is the Rooster. 🐓 ')
    elif(inputNumber % 12 == 2):
        print('Year', inputNumber, ' is the Dog. 🐶 ')
    elif(inputNumber % 12 == 3):
        print('Year', inputNumber, ' is the Pig. 🐷 ')
    elif(inputNumber % 12 == 4):
        print('Year', inputNumber, ' is the Rat. 🐀 ')
    elif(inputNumber % 12 == 5):
        print('Year', inputNumber, ' is the Ox. 🐂 ')
    elif(inputNumber % 12 == 6):
        print('Year', inputNumber, ' is the Tiger. 🐅 ')
    elif(inputNumber % 12 == 7):
        print('Year', inputNumber, ' is the Rabbit. 🐇 ')
    elif(inputNumber % 12 == 8):
        print('Year', inputNumber, ' is the Dragon. 🐉 ')
    elif(inputNumber % 12 == 9):
        print('Year', inputNumber, ' is the Snake. 🐍 ')
    elif(inputNumber % 12 == 10):
        print('Year', inputNumber, ' is the Horse. 🐎 ')
    elif(inputNumber % 12 == 11):
        print('Year', inputNumber, ' is the Sheep. 🐑 ')
    else:
        print('Please try again. 🔄 ')

else:
    print(" ❌ Input is Invalid! Please try again. ")


////////////////////// Second Method \\\\\\\\\\\\\\\\\\\\\\\\\

inputNumber = int(input('Please enter a natral number (< or = 12)\n'))
# I asked user to enter a number and change the typr of input from String to Intiger.

if(inputNumber > 0 & inputNumber <= 12):

    yearName = ["Monkey", "Roster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"]
    calculatorName = yearName[inputNumber % 12]
    print('Year ', inputNumber,' is ',calculatorName)

else:
    print(" ❌ Input is Invalid! Please try again. ")



