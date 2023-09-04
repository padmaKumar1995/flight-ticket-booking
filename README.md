# Flight Ticket Booking

---

## Problem Statement
An Airline operates multiple flights for different locations. Write a basic ticket booking program for their flights.

---

## Requirements
- There are multiple flights each identified by the unique names as follows, 
  - Flight-A112-Chennai-Mumbai 
  - Flight-A113-Chennai-Kolkata 
  - Flight-A114-Chennai-Delhi ... etc., 
- Flight seats are categorized under two types namely Economy and Business
Class.
  - The number of seating arrangements and the number of seats in business class and economy class should be given as file input.
  - The file name will have a flight number.
  - For example, Lets say file Flight-A112-Chennai-Mumbai.txt, here A112 is
  the flight number and it has the details as follows, 
    - Business : {2, 3, 2}, 12 
    - Economy : {3, 4, 4}, 20 <br>
    <br>
    This means, <br>
  12 rows of business class tickets with seating arrangements like, <br>
      WA AMA AW <br> 
      WA AMA AW <br> 
      ..... 9 more rows <br>
    <br>
  20 rows of Economy class tickets with seating arrangements like, <br> 
    WMA AMMA AMMW <br>
    WMA AMMA AMMW <br>
    .... 17 more rows <br>
    <br>
    W - Window <br>
    M - Middle <br>
    A - Aisle <br>
    (The program should calculate this arrangement based on the input from each file)
- Base price of an Economy Class ticket is INR1000 and for Business Class it is
  INR 2000. 
- Aisle and Window seats will cost INR 100 more 5.
- in single booking any number of tickets of single class can be booked
- Each booking should be provided with a ticket
- Surge Pricing - After each successful booking increase fare by Rs.100
- Provide option to book meal with each booking
- Cancellation is allowed for each ticket with fee Rs.200

### Your program should handle the following cases and display results appropriately
- List flight details
   - List down no. of flights and the name of flights from the folder
- Handle booking 
  - Search flights 
    - Filter flights from given location (input as source and destination)
    - Filter flights who is having business class alone
  - The user can choose the seats. Seat number is represented as
    Row_Column. Example 5_F represents 5th row, 6th Column
- Handle cancellation 
  - Mention the seat to be canceled for the specific Booking ID Print all available seats for each flight 
- Print seat numbers for which meal is ordered for each flight 
- Print individual and flight summary for all the bookings 
  - Input : BookingID 
    output : Passenger Details (with seat and Meal preference) &
        Flight details. (Flight no)
