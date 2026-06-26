# Olive Harvest Wage Calculator

A Java console  amateur application designed to automate and optimize the calculation of daily wages for worker crews during the olive harvest.

## Description

This program dynamically calculates the earnings per sack and the daily wage of each worker based on the total weight of the tanks (trailers), the price per kilogram of olives, the number of days worked, and the crew size. 

The tool has been optimized using two-dimensional arrays and loops to easily scale to any number of tanks, days, or workers without needing to modify the source code.

## Key Features

* **Dynamic data entry:** The user defines all key variables (price, number of tanks, days, and workers) at startup.
* **Automated calculations:** Calculates the price per sack and breaks down the exact daily wage that corresponds to each worker.
* **Scalability:** Supports harvests of any duration (1 day or several months) using matrices to store daily production.
* **Basic error handling:** Prevents common runtime errors, such as division by zero on days with no production.

## Technologies Used

* **Language:** Java (JDK 8 or higher)
* **Libraries:** `java.util.Scanner` (Standard Library)

## How to Run the Project

You can run this project using any Java IDE (like IntelliJ IDEA, Eclipse, or NetBeans) or directly from the terminal.

### From the terminal:

1. Clone this repository:
   ```bash
   git clone [https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git](https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git)
### Usage example:
=== INITIAL CONFIGURATION ===
Enter the price of olives per kg (e.g., 0.30): 0.30
Enter the number of tanks to calculate: 1
Enter the number of working days per tank: 2
Enter the number of workers (crew size): 4

--- Data for TANK 1 ---
Enter the amount of olives in tank 1 (kg): 1000
Day 1 - Enter the number of sacks collected: 10
Day 2 - Enter the number of sacks collected: 15

================ RESULTS ================

--- RESULTS TANK 1 ---
The wage for a worker on day 1 is: 30.00 €
The wage for a worker on day 2 is: 45.00 €
The earnings per sack for tank 1 is: 12.00 €
The total earnings for tank 1 is: 300.00 €
