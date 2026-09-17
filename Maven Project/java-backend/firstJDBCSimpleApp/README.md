## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Database credentials

`LaunchApp.java` reads the database username and password from local environment variables. Do not put your real password in the Java file.

In the PowerShell terminal you use to run the application, set them for that terminal session:

```powershell
$env:DB_USERNAME = "your_database_username"
$env:DB_PASSWORD = "your_real_database_password"
```

These values are not committed to Git. The included `.gitignore` also prevents common local credential files from being added accidentally.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
