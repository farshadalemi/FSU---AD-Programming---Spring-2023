"""+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
File: calculateTime.py
Instructor: Nguyen Thai
Date: 2/4/2023
Student: Farshad Alemi
Description: 
    
    
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"""
import time
import calendar

# Get current time in seconds since January 1, 1970
currentTimeInSeconds = calendar.timegm(time.localtime())
# Calculate the currentHour, currentMinute and currentSecond
# from currentTimeInSeconds using Python's numeric operators
#  INSERT YOUR CODE HERE.
currentTimeInMinutes = currentTimeInSeconds / 60
currentTimeInHours = currentTimeInSeconds // 60**2  # I have used // to pass integer for days calculation.
currentTimeInDays = currentTimeInHours // 24

# Print current time
print("Current time is ", int(currentTimeInHours), ":", int(currentTimeInMinutes), ":", currentTimeInSeconds)
print("Since Junuary 1st 1970 to this day ", currentTimeInDays," days is passed." )
# I have used int() to typecasting the hours and minuts in order to have more readable output.