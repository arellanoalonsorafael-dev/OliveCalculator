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
