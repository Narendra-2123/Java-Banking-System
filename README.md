# Console Banking System 🏦

A secure, Java-based console application that simulates core banking operations. This project demonstrates the principles of **Encapsulation** and **Data Security** by restricting direct access to sensitive account information.

## 🚀 Key Technical Skills Demonstrated
This project is built to showcase fundamental Object-Oriented Programming (OOP) concepts:

* **Encapsulation (Data Hiding):**
    * Implemented `private double balance` to ensure sensitive financial data cannot be accessed or modified directly from outside the class.
    * Access is strictly controlled via public methods (`deposit`, `withdraw`), acting as a security layer.

* **Business Logic Implementation:**
    * **Validation Logic:** Prevents invalid transactions (e.g., withdrawing more than the available balance or depositing negative amounts).
    * **State Management:** Maintains the account state persistently during the runtime session.

* **Interactive Control Flow:**
    * Utilized `Switch-Case` statements for a clean, menu-driven user interface.
    * Implemented an infinite `while` loop to allow multiple transactions in a single session.

## 🛠️ Tech Stack
* **Language:** Core Java
* **Input Handling:** `java.util.Scanner`
* **Concepts:** OOPs (Encapsulation), Constructors, Exception Prevention

## 💻 How to Run
1.  Ensure Java is installed.
2.  Clone the repository:
    ```bash
    git clone [https://github.com/Narendra-2123/Java-Banking-System.git](https://github.com/Narendra-2123/Java-Banking-System.git)
    ```
3.  Compile the source code:
    ```bash
    javac SimpleBanking.java
    ```
4.  Run the application:
    ```bash
    java SimpleBanking
    ```

## 📸 Example Usage
```text
Welcome to the Simple Banking System
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Choose an option: 1
Current Balance: $100.0

Choose an option: 2
Enter deposit amount: 500
Deposited: $500.0

Choose an option: 3
Enter withdrawal amount: 2000
Invalid withdrawal or insufficient funds.

Choose an option: 4
Thank you for banking with us!
```

## 👨‍💻 Author

**Narendra**
