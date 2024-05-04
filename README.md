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

1. **Clone the Repository**:
   - Open a terminal or command prompt.
   - Navigate to the directory where you want to clone the project.
   - Use the `git clone` command followed by the URL of the Git repository. For example:
     ```
     git clone https://github.com/crkarthik11/AttendNow.git
     ```

2. **Open the Project**:
   - Navigate into the cloned project directory:
     ```
     cd AttendNow
     cd backend
     ```

3. **Build the Project**:
   - To Build a Gradle project, use the `./gradlew build` command:
     ```
     ./gradlew build
     ```

4. **Import into IDE**:
   - Open your preferred Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or Visual Studio Code.
   - Import the project into your IDE:
     - For IntelliJ IDEA: Choose "Import Project" and select the project directory.
     - For Eclipse: Choose "Import" > "Existing Gradle" and select the project directory.
     - For Visual Studio Code: Open the project folder.

5. **Run the Application**:
   - Run the application from the command line using Gradle:
     - For Gradle: `./gradlew bootRun`

6. **Access the Application**:
   - Once the application is running, open a web browser and go to `http://localhost:9080` (or the configured port if it's different) to access your Spring Boot application.



### Running an Angular UI Application

1. **Navigate to Project Directory**:
   - Open a terminal or command prompt and navigate to your Angular project directory:
     ```
     cd ui
     ```

3. **Install Dependencies**:
   - Run `npm install` to install project dependencies specified in `package.json`.

4. **Run the Application**:
   - After installing dependencies, you can run the Angular application using Angular CLI.
   - Run the following command:
     ```
     ng serve
     ```
   
   - This command will compile the application and start a development server. By default, the application will be available at `http://localhost:4200/` in your web browser.

5. **Access the Application**:
   - Open a web browser and navigate to `http://localhost:4200/` (or the address shown in the terminal) to access your Angular application.
