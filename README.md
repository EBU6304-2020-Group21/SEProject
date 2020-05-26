# _Ramen_ -- An Self-Service Software for Restaurant
EBU6304-Software Engineering Project of Group 21
##Environment
- Running Environment: JDK-11.0.2
- Developing Environment: IntelliJ IDEA + Git
- Dependencies: fastjson-1.2.68.jar
## Installation - How to Run the Software
### Method A - Run JAR Package
- Clone the repository to your PC, and make sure running environment is JDK-11.0.2
- Open the terminal (for Mac) or cmd (for windows) and move to the project dictionary
- Run Ramen.jar `$ java -jar Ramen.jar` or double click it.
- Make sure that `Ramen.jar` and `/File` are in the same dictionary!
### Method B - Run by Command Line
- Clone the repository to your PC, and make sure running environment is JDK-11.0.2
- Open the terminal (for Mac) or cmd (for windows) and move to the project dictionary
- Compile the programme
`javac -d bin/ src/main/controller/*.java src/main/views/*.java src/main/entity/*.java -cp lib/*.jar`
- Run the programme `java -cp bin/:lib/fastjson-1.2.68.jar main.views.GUIModel`
## Main Functions
### For Customer (Self-Service Kiosk)
- Dining by themselves
- Sign in or Sign up for the loyalty service
- Look up their stamps
### For Manager (Management System)
- Modify the menu price
- Modify the availability for the dishes
- See the sales report of last week
- (Optional) Send emails of the report for anyone
## Developers and their Contributions
We are all from Beijing University of Posts and Telecommunications, and members of BUPT-QMUL Joint Programme. Group 21 of EBU6304 Software Engineering Project   
### Yuxuan Wu
Group leader, allocating the tasks, be responsible for the system design and analysis. Specifying the requirements of ordering process. Coding for the Control Classes. Leading for the refractor and system test. Being in charge of the design and analysis part of report and integrated the report.
### Kai Yan
Participate in the system analysis and design. Design the the operation logic and the flow through which the program runs with flowchart. Design and code most part of GUI interface. Code the controller which interacts with the view part. Participate in a part of the report. Refactor the code.
### Yinan Zhang
Participate in the requirement analysis. Charge of the test of the system including code of TDD and Integration Testing of the final product. Take part of entity layer' s design and implementation. Participate in testing part of the report. Refactor the code.
### Jianning QU
Participating in the story cards and project backlogs writing and prototype designing in the beginning. Being in charge of writing code for Controller part. And I participated in TDD testing. Last, I design the report structure and write the User Manual and the Project Management part of the final report.
### Chenyang Xie
Participate in the system analysis and requirement investigation. Collect all storys into the product backlog and update this document constantly. Take part of design about prototype. Design and code part of GUI layer. Participate in the test of work. Be responsible for the generation and modification of UML. Be responsible for code documentation(Javadocs). Write several parts of report.
### Guowei Lin
Wrote the story cards; designed several initial GUI surface , studied how to use TDD to test Controller, how to use to cmd to run our project and found residual mistakes, how to write the test doc, design doc and develop doc; screen shot some materials for the user manual; ensured the completeness of our report.



