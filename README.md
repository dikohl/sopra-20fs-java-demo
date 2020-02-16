# sopra java demo

- Download Intellij Ulitmate
    - https://www.jetbrains.com/student/
    - Ultimate Version allows you to work on JavaScript and Java Code in the same IDE
- Gradle
    - helps assemble & manage packages/dependencies and build an application
    - Tasks can be defined and used to build/run/verify code
    - most important file(s)
        - build.gradle (file with all the info)
        - gradlew & gradlew.bat (startup scripts for windows and unix)
    - IntelliJ has a Gradle Tab where you can manage everything (no need to touch the files)
    - Local as well as online Jars possible
-  Project structure
    - src folder with 2 subfolders "main" & "test"
    - "main" contains all the production logic / code
    - "test" is basically a mirror of main and contains tests for the logic
- Java/Project Setup in IntelliJ
    - Correct Java Version (build and run!)
        - build: Preferences -> Build, Execution, Deployment -> Build Tools -> Gradle -> Gradle JVM -> 13 (might need to add 13 first)
        - run: Edit Configuration -> JRE -> 13 (might need to add 13 first)
- Building the Project
    - build: compile the
    - run: compile and start application (prod environment)
    - debug: compile and start application, able to use breakpoints etc (dev environment)
- Testing Code
    - short cut to create (and find) test from a class in "main" (Ctrl+Shift+T / Shift+⌘+T)
    - Run test with little play button
    - Debugging is also possible here
- Debugging Code
    - Breakpoints can be set next to the line number
    - F7 - F9 can be used to step through code and in to functions
    - You can use Watchers to see the value of variables at certain breakpoints

**Useful INTELLIJ shortcuts**

https://medium.com/better-programming/intellij-keyboard-shortcuts-to-swear-by-7638c0efcc76

| Action                                         | Windows             | Mac                 | Comment                   |
| -------------                                  |:-------------:      | :----:              |---------                  |
| Generate Template Code (empty Method etc.)     | Ctrl+N              | ⌘+N                 |Try this if anything is red|
| Recommendation / Quick fix                     | Alt+Enter           | Option+Enter        |                           |
| Rename (anything)                              | Shift+F6            | Shift+F6            |                           |
| Copy Line                                      | Alt+D               | ⌘+D                 |                           |
| Inline a variable/method                       | Ctrl+Alt+N          | Option+⌘+N          |                           |
| Search Class by name in project                | Double Shift        | Double Shift        | Also Alt+O or ⌘+O         |
| Move line up/down                              | Shift+Alt+Up/Down   | Shift+⌘+Up/Down     |                           |
| Extract as Variable / Parameter / Method       | Alt+Ctrl+V/P/M      | Option+⌘+V/P/M      | You can also just write ".var" or similar at the end (new App().var => App app = new App();) |
| Create/Find Test                               | Shift+Ctrl+T        | Shift+⌘+T           |                           |
| Search Settings                                | Shift+Alt+A         | Shift+⌘+A           |                           |
| Go back/forward (files / cursor location)      | Ctrl+Alt+Left/Right | Option+⌘+Left/Right |                           |