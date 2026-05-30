# Banking Management System

A comprehensive Java-based banking management system that handles multiple types of bank accounts and transactions.

## Overview

This is a command-line banking management system built with Java that allows users to manage their bank accounts, perform transactions, and track their financial activities. The system supports multiple account types and provides an interactive menu-driven interface.

## Features

- **User Management**: Create and manage user profiles with user ID, name, and email
- **Multiple Account Types**:
  - **Saving Account**: Traditional savings account with deposit and withdrawal capabilities
  - **Current Account**: Business account with overdraft facility support
- **Transaction Management**: Track and manage all transactions (deposits and withdrawals)
- **Interactive Menu System**: User-friendly menu-driven interface for account operations
- **Account Operations**:
  - Deposit funds
  - Withdraw funds
  - Check balance
  - View transaction history

## Project Structure

```
banking_managementjava/
├── src/                    # Source code directory
├── bin/                    # Compiled bytecode
├── java                    # Main source files
├── .classpath             # Eclipse classpath configuration
├── .project               # Eclipse project file
└── .settings/             # IDE settings
```

## Technology Stack

- **Language**: Java (100%)
- **IDE**: Eclipse (optional)
- **Build**: Java Compiler

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any IDE (Eclipse, IntelliJ IDEA) or command-line compiler

### Installation & Running

1. Clone the repository:
```bash
git clone https://github.com/Kabhisekkumar65/banking_managementjava.git
cd banking_managementjava
```

2. Compile the Java files:
```bash
javac -d bin src/*.java
```

3. Run the application:
```bash
java -cp bin BankingSystem
```

## Usage Example

```
=================================
 Welcome To Banking System
=================================

Enter User ID : 101
Enter User Name : Abhisek
Enter Email : abhisek@gmail.com

===== Banking Menu =====
1. Saving Account
2. Current Account
3. Transaction
4. Exit
Enter Your Choice : 1
```

### Menu Options

1. **Saving Account** - Create and manage savings accounts
   - Enter account number and balance
   - Deposit and withdraw funds
   
2. **Current Account** - Create and manage current accounts
   - Set overdraft limits
   - Perform deposit and withdrawal transactions
   
3. **Transaction** - View and manage transactions
   - Record transaction details (ID, Type, Amount)
   
4. **Exit** - Close the application

## Core Classes

The system is built around the following key classes:

- **User**: Handles user profile information
- **Account**: Base class for all account types
- **SavingsAccount**: Implements savings account functionality
- **CurrentAccount**: Implements current account with overdraft facility
- **Transaction**: Manages transaction details and history
- **BankingSystem**: Main controller class

## Features Explained

### Saving Account
- Standard savings account for individuals
- Supports deposits and withdrawals
- Real-time balance updates

### Current Account
- Business-oriented account
- Overdraft facility support for approved limits
- Enhanced withdrawal capabilities beyond balance

### Transaction History
- All transactions are recorded with:
  - Transaction ID
  - Transaction Type (Deposit/Withdrawal)
  - Amount transacted
  - Timestamp information

## Future Enhancements

- [ ] Database integration for persistent storage
- [ ] File-based data persistence
- [ ] Interest calculation for savings accounts
- [ ] Loan management module
- [ ] GUI implementation using Swing/JavaFX
- [ ] Multi-user authentication system
- [ ] Transaction reports and analytics
- [ ] Admin panel for account management

## Contributing

Contributions are welcome! Feel free to fork this repository and submit pull requests for improvements.

## License

This project is open source and available for educational purposes.

## Author

**Kabhisekkumar65**

## Support

For issues or questions about the project, please open an issue on the GitHub repository.

---

**Note**: This is a learning project designed to demonstrate core Java concepts including Object-Oriented Programming, user input handling, and data management.
