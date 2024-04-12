# Executive Barbering Shop Simulation
![screenshot.png](assets/screenshot.PNG)

This Java program simulates the operations of "Executive Barbering Shop" according to the provided requirements. It allows users to trigger events and observe the state of the shop.

### Features:

- Simulates the seating and movement of clients in the barbering shop.
- Displays the state of the shop after each event.
- Supports both ORD (ordinary) and VIP clients.


### Requirements
- Java Development Kit (JDK) installed on your system.
- Git installed to clone the repository.

### How to Use:

1. Clone the repository:

   ```bash
   git clone https://github.com/Ken2ie/javaproject1.git

2. Open in your preferred browser.

3. In the terminal, Compile the Java Files
   
   ```bash
   javac Main.java

4. Run the program
 
   ```bash
   java Main
   
5. Press space key and enter to start or initiate the simulation
6. Continue till simulation terminates at 20 simulations.


### Events
When the user triggers an event by pressing the space key, a random number x is generated, ranging from 0 to 3 inclusive. Depending on the value of x, specific events occur:

1. When x = 0:
        Event: -- clientName
        Description: The barber is done trimming the hair of the current client (ORDi or VIPi) seated in the main chair.

2. When x = 1:
        Event: ++ VIPi
        Description: A VIP number 'i' has come into the shop and is seated.

3. When x = 2 or x = 3:
        Event: ++ ORDi
        Description: An ordinary client number 'i' has come into the shop and is seated.

4. If all the seats are occupied and x > 0:
        Event: +- clientName
        Description: The client has come and gone back due to all seats being occupied.


### Contributing
Contributions to the project are welcome. Please follow the standard Git flow for contributions:
- Fork the repository.
- Create a feature branch.
- Commit your changes.
- Push to the branch.
- Open a pull request.

