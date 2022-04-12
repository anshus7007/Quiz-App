package com.example.quiz

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "Under which of the following Android is licensed?",

           "OSS",
           "Sourceforge",
           "Apache/MIT",
           "None of the above",
           3
       )
       var question2 = QuestionData(
           2,
           "Android is",

           "an operating system",
           "a web browser",
           "a web server",
           "None of the above",
           1
       )
       var question3 = QuestionData(
           3,
           "For which of the following Android is mainly developed?",

           "Servers",
           "Desktops",
           "Laptops",
           "Mobile devices",
           4
       )
       var question4 = QuestionData(
           4,
           "Which of the following virtual machine is used by the Android operating system?",

           "JVM",
           "Dalvik virtual machine",
           "Simple virtual machine",
           "None of the above",
           2
       )

       var question5 = QuestionData(
           5,
           "Android is based on which of the following language?",

           "Java",
           "C++",
           "C",
           "None of the above",
           1
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}