package com.quizapp

object Constants {

    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Which of the following is an example of UML diagram?",
            R.drawable.q1,
            "Use Case Diagram", "Use Case Description",
            "Event Table", "Screen Layout", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "A(n)__can be used to manage the development progress?",
            R.drawable.q2,
            "Spiral model", "Use Case Diagram",
            "Activity Diagram", "Gantt chart", 4
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "The UML views ?",
            R.drawable.q3,
            "Define how the UML diagrams are to be used", "Define the sequence of events for analysis and design",
            "Are part of the UML specification", "Organize the UML diagrams to improve understanding of their purpose", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "The metamodel includes?",
            R.drawable.q4,
            "Rules for the use of modeling elements", "Definitions of the modeling elements",
            "The visual standard for each model element", "Programming implementation specification for each model element", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "The use case view ?",
            R.drawable.q5,
            "Consists of textual documents listing the user requirements", "Consists of business procedures and policies",
            "Consists of diagrams, narratives, and scenarios", "Consists of project context, scope, and constraints requirements", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "The logical view?",
            R.drawable.q6,
            "Provides a set of models to describe possible software solutions", "Translates user requirements in an implementation language",
            "Describes the program logic for specific business rules", "Describes the program logic for specific business rules", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "The class diagram?",
            R.drawable.q7,
            "Is the first model created in the project", "Is created after the other models",
            "Is used to specify objects and generate code", "Is used to create the sequence and collaboration diagrams", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "The activity diagram models?",
            R.drawable.q8,
            "Object interactions and communication", "The movement of objects through the system",
            "Processes, conditional logic, and concurrency", "The steps required for the construction of the logical view", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "The sequence diagram models?",
            R.drawable.q9,
            "The sequence of activities to implement the model", "The way that objects communicate",
            "The relationships among objects", "The order in which the class diagram is constructed", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "The collaboration diagram",
            R.drawable.q10,
            "Is a unique view of object behavior", "Models the connections between the different views",
            "Models the relationship between software and hardware components", "Models the way objects communicate", 4
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "The component view(hard)?",
            R.drawable.q11,
            "Defines the implementation language of a software component", "Establishes the installation procedures for a software program",
            "Describes the hardware configuration required for a software component", "Defines the bundling of classes and components into a functional unit", 4
        )

        questionsList.add(que11)
        // 12
        val que12 = Question(
            12, " You are given the following clipping of a UML2 class diagram. Which of the following statements are true(hard)?",
            R.drawable.q12_uml,
            "An object of A may or may not contain objects of C", "Objects of B and D can see g",
            "An instance of A can see y.", "Objects of C and B can see f.", 4
        )

        questionsList.add(que12)
        // 13
        val que13 = Question(
            13, "What did the Object Analysis and Design Task Force RFP ask for(hard)?",
            R.drawable.q13,
            "An analysis and design methodology", "An end to the notation wars",
            "A metamodel for specifying software solutions", "A diagramming notation for specifying software solutions", 3
        )

        questionsList.add(que13)
        // 14
        val que14 = Question(
            14, "The UML may be extended(hard)?",
            R.drawable.q14,
            "By altering the model element definitions", "By using stereotypes to qualify element descriptions",
            "By building new diagrams using blends of existing notations", "By adding your own notation elements", 2
        )

        questionsList.add(que14)
        // 15
        val que15 = Question(
            15, "The deployment view(hard)?",
            R.drawable.q15,
            "Models the physical components of an architecture", "Defines the installation procedures for the software",
            "Models the business units in which the software will be deployed", "Defines the deployment schedule for an incremental installation", 1
        )

        questionsList.add(que15)
        // 16
        val que16 = Question(
            16, "How many views of the software can be represented through the Unified Modeling Language (UML)(hard)?",
            R.drawable.q16,
            "Four", "Five",
            "Nine", "None of the above", 2
        )

        questionsList.add(que16)
        // 17
        val que17 = Question(
            17, "Which of the following UML diagrams represent the structural View of the software(hard)?",
            R.drawable.q17,
            "Class diagram", "Object diagram",
            "Both a. and b.", "None of the above", 3
        )

        questionsList.add(que17)
        // 18
        val que18 = Question(
            18, "Which of the following is not a UML diagram?(hard)",
            R.drawable.q18,
            "Class diagram", "Object Diagram",
            "Interface diagram", "Use case model", 3
        )

        questionsList.add(que18)
        // 19
        val que19 = Question(
            19, " Which of the following views represents the interaction of the user with the software but tells nothing about the internal working of the software?(hard)",
            R.drawable.q19,
            "Use case diagram", "Activity diagram",
            "Class diagram", "All of the above", 1
        )

        questionsList.add(que19)
        // 20
        val que20 = Question(
            20, " UML describes the real-time systems(hard)?",
            R.drawable.q20,
            "True", "False",
            "No idea", "...", 1
        )

        questionsList.add(que20)
        // 21
        val que21 = Question(
            21, "Composite Structure Diagram is used to represent the internal structure of a class(Extreme)?",
            R.drawable.q21,
            "True", "False",
            "Both", "No idea", 1
        )

        questionsList.add(que21)
        // 22
        val que22 = Question(
            22, "Behavior Diagrams includes(Extreme)?",
            R.drawable.q22,
            "Use Case Diagrams", "State Diagrams",
            "Activity Diagrams", "All of these", 4
        )

        questionsList.add(que22)
        // 23
        val que23 = Question(
            23, "Things in UML can be ...(Extreme)?",
            R.drawable.q23,
            "Structural", "Behavioural",
            "Grouping", "All of these", 4
        )

        questionsList.add(que23)
        // 24
        val que24 = Question(
            24, "One of the Characteristics of UML(Extreme)?",
            R.drawable.q24,
            "It is a generalized modelling language.", "It is distinct from other programming languages like C++, Python, etc.",
            "It is used to visualize the workflow of the system.", "All of these", 4
        )

        questionsList.add(que24)
        // 25
        val que25 = Question(
            25, "A conceptual model in UML is composed of several interrelated concepts. It makes it easy to understand the objects and how they interact with each other.(Extreme)?",
            R.drawable.q25,
            "True", "False",
            "Both", "No idea", 1
        )

        questionsList.add(que25)
        // 26
        val que26 = Question(
            26, "There are 5 views that are represented through the Unified Modelling Language (UML) is that statement true(Extreme)?",
            R.drawable.q26,
            "that is true", "that is not true",
            "No idea", "...", 1
        )

        questionsList.add(que26)
        // 27
        val que27 = Question(
            27, "These 5 views in UML are represented through 9 UML diagrams is that statement true(Extreme)?",
            R.drawable.q27,
            "that is true", "that is not true",
            "No idea", "...", 1
        )

        questionsList.add(que27)
        // 28
        val que28 = Question(
            28, "Construction iterations are based on?(Extreme)?",
            R.drawable.q28,
            "System Activities", "System Use Cases",
            "System Classes", "System States", 2
        )

        questionsList.add(que28)
        // 29
        val que29 = Question(
            29, "Deployment Diagram is used to represent system hardware and its software(Extreme)?",
            R.drawable.q29,
            "True", "False",
            "No idea", "...", 1
        )

        questionsList.add(que29)
        // 30
        val que30 = Question(
            30, "Once classes and attributes have been identified and placed into a diagram, the next stage is to add?(Extreme)?",
            R.drawable.q30,
            "Associations", "Operations",
            "Multiplicities", "Actors", 3
        )

        questionsList.add(que30)
        return questionsList
    }
}