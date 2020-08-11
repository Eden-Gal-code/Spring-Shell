EXERCISE-DMO:

AVAILABLE COMMANDS

Built-In Commands
        clear: Clear the shell screen.
        exit, quit: Exit the shell.
        help: Display help about available commands.
        script: Read and execute commands from a file.
        stacktrace: Display the full stacktrace of the last error.

Json Handler
        calculate: Gets a Json Object -Checking compatibility of numbers and strategy and calculating.
        format: Selecting data format : Json  {numbers,operator} is default
        strategy: Selecting number strategy : Positive is default


Get Started:

calculate {\"numbers\":[1,2,3,4,5],\"operator\":\"plus\"}

will Log into output.log and return the calculation.exit


Jar File:
under: target/exercise-0.0.1-SNAPSHOT.jar
use:

java -jar target/exercise-0.0.1-SNAPSHOT.jar
