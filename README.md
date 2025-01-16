# **Shell for everybody** 

Welcome to **Shell for everybody**, a simple command-line interface (CLI) program that mimics basic functionalities of a shell. It's designed to execute commands and interact with the user, offering a straightforward and user-friendly experience.

## 📂 **Features**

### ✅ **Basic Commands**

- **Create a File**:
   - Allows you to create a new text file with specific content in a designated location.
   - Syntax: `tog "text to save" > /path/to/file.txt`
   - Example:
     ```bash
     $ tog "Hello, World!" > ~/Documents/hello.txt
     ```

  - **Echo a String**:
     - Echoes a string back to the terminal.
     - Syntax: `echo "Your Text"`
     - Example:
    ```bash 
    $ echo "This is a test"
       ```
  - **Edit and read files**:
    - Usage to read a file:
    ```bash
    $ cat /path/to/file.txt -r 
    ```
     -  Usage to edit a file:
      ```bash
      $ cat ~/Documents/example.txt -e
      ```
   - **Type command**:
  - Displays the type of command (whether it's a built-in shell command, a function, etc.).
  - Usage:
    ```bash
    type command_name
    ```
  - Example:
    ```bash
    type echo
    ```
  - **Exit**:
   - Terminates the shell program.
   - Usage:
     ```bash
     exit 0
     ```
   - Description: Exits the shell with status `0`. If no arguments or incorrect syntax are provided, it shows an error.
### 🔄 **File and Directory Management**

- **Change Directory**:
   - Allows you to navigate between directories.
   - Syntax: `cd /path/to/directory`
   - Example:
     ```bash
     $ cd ~/Documents
     ```

- **Print Working Directory**:
   - Lists files and directories in the current directory.
   - Syntax: `pw`
   - Example:
     ```bash
     $ pwd
     ```


###  **Advanced Functionality**

- **File Creation with Redirect (`>`)**:
   - The shell supports redirection to create files with user-defined content.
   - Syntax: `tog "text" > /path/to/file.txt`
   - The content inside the quotation marks will be written to the file at the specified location.


## ⚙️ **Installation**

1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/yourusername/my-shell.git
    ```
