# Todo List Application

Develop a command-line or simple GUI-based Todo List application. Users should be able to add tasks, mark them as completed, and remove tasks. This project will introduce you to working with data structures like lists or arrays and handling user input.

## User Guide

1. **Add Task:**
   - Click the "Add Task" button to create a new task. A new task will be added to the list with a default text, and you can modify the text by clicking on it.

2. **Mark as Completed:**
   - Each task has a "Done" button. Click the "Done" button to mark a task as completed. The background color of the task will change, indicating that it's done.

3. **Remove Completed Tasks:**
   - Click the "Clear" button to remove all completed tasks from the list.

## How It Works

- The application uses Java with Swing for the graphical user interface.
- Tasks are represented as instances of the `Task` class, and the list of tasks is managed by the `List` class.
- The UI includes a title bar, a list of tasks, and a footer with buttons to add tasks and clear completed ones.

## Screenshots


## Code Structure

- `Task` class represents an individual task with a checkbox, task name, and "Done" button.
- `List` class manages the list of tasks, updates task numbers, and removes completed tasks.
- `Footer` class contains buttons for adding new tasks and clearing completed tasks.
- `TitleBar` class displays the title of the Todo List application.
- `AppFrame` class sets up the main application frame and adds the title, list, and footer components.

## How to Run

1. Make sure you have Java installed on your system.
2. Compile and run the `ToDoList` class.

```bash
javac ToDoList.java
```
```bash
java ToDoList
```

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Contact
For any questions or feedback, feel free to contact the project maintainer.