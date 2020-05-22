# About Cucumber(BDD)
Behavior Driven testing is an extension of TDD. Like in TDD in BDD also we write tests first and the add application code. The major difference that we get to see here are

    Tests are written in plain descriptive English type grammar
    Tests are explained as behavior of application and are more user-focused
    Using examples to clarify requirements

# CucumberRun Options

# run cucumber using MVN: mvn test

# cucumber options run using MVN for tags:

### To run scenarios with @debug1 and @debug2:

## Old version of Cucumber-jvm:

# mvn test -Dcucumber.options="--tags @debug1 --tags @debug2"

## Actual version of Cucumber-jvm:

# mvn test -Dcucumber.options="--tags '@debug1 and @debug2'"

### To run scenarios with @debug1 or @debug2:

## Old version of Cucumber-jvm:

# mvn test -Dcucumber.options="--tags @debug1,@debug2"

## Actual version of Cucumber-jvm:

# mvn test -Dcucumber.options="--tags '@debug1 or @debug2'"


### To run scenarios with ~@ignore1 or ~@ignore2

## Actual version of Cucumber-jvm:

# mvn test -Dcucumber.options="--tags ~@ignore1 --tags ~@ignore2"
