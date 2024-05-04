# AttendNow
AttendNow is your go-to solution for hassle-free attendance management


## Prerequisites
 - IDE (VSCode,Eclipse,IntelliJ IDEA)


### Installing JDK 21 and Setting Up Environment Variables

1. **Download JDK 21**:
   - Go to the [JDK download page](https://adoptium.net/temurin/releases/).
   - Accept the license agreement and download the appropriate JDK installer for your OS.

2. **Install JDK 21**:
   - Run the downloaded installer and follow the installation instructions.

3. **Verify Installation**:
   - Open a terminal or command prompt.
   - Type `java -version` and press Enter to ensure Java is installed properly.

4. **Set JAVA_HOME**:
   - On Windows:
     - Open Control Panel > System and Security > System.
     - Click on "Advanced system settings" > "Environment Variables".
     - Under "System variables", click "New" and add `JAVA_HOME` with the JDK installation directory path (e.g., `C:\Program Files\Java\jdk-21`).
   - On macOS and Linux:
     - Edit your shell configuration file (e.g., `.bashrc`, `.bash_profile`, or `.zshrc`).
     - Add `export JAVA_HOME=/path/to/jdk-21` to the file, replacing `/path/to/jdk-21` with the actual JDK installation directory.
     - Run `source ~/.bashrc` (or `source ~/.bash_profile` or `source ~/.zshrc`) to apply the changes.

5. **Update PATH**:
   - On Windows:
     - In "Environment Variables", find the `Path` variable under "System variables" and edit it.
     - Add `%JAVA_HOME%\bin` to the list of paths.
   - On macOS and Linux:
     - In your shell configuration file, add `export PATH=$JAVA_HOME/bin:$PATH`.
     - Run `source ~/.bashrc` (or `source ~/.bash_profile` or `source ~/.zshrc`) to apply the changes.



### Installing Node.js

1. **Download Node.js version 20.12.2**: 
   - Go to the [official Node.js website](https://nodejs.org/en/download/).
2. **Install Node.js**:
   - **Windows**:
     - Double-click the downloaded installer and follow the installation wizard prompts.
   - **macOS**:
     - Double-click the downloaded `.pkg` file and follow the installation wizard prompts.
   - **Linux**:
     - Install via package manager. For example, on Ubuntu:
       ```
       sudo apt update
       sudo apt install nodejs
       ```

3. **Verify Installation**:
   - Open a terminal or command prompt.
   - Type the following commands:
     ```
     node -v
     npm -v
     ```
   - These should print out the versions of Node.js and npm, respectively.



## Cloning and Setting Up Project


### Setting Up a Spring Boot backend server Project

**Clone the Repository**:
   - Open a terminal or command prompt.
   - Navigate to the directory where you want to clone the project.
   - Use the `git clone` command followed by the URL of the Git repository. For example:
     ```
     git clone https://github.com/crkarthik11/AttendNow.git
     ```
     ```
     cd AttendNow
     ```
