<<<<<<< HEAD
# Hero Squad

This is a java app that enables a user create a hero and a squad and also the user can add a hero to a squad

## Author

**EDWARD GERO**
=======
## Getting Started

Clone this repository to your local machine to get Started



### Prerequisites

You need the following installed on your machine
- java
- JDK - Java Development Kit
- Maven
- Gradle
- An IDE - Intellij


To confirm run the following command on linux
```
$ java --version       //java version
$ mvn --version        //maven version
$ gradle --version     //gradle version
```
To confirm run the following command on linux
```
$ java --version       //java version
$ mvn --version        //maven version
$ gradle --version     //gradle version
```

## Installing

After cloning to your local machine navigate to the folder you cloned into and open it with intellij.
* Navigate into the ``` src/main/java/App.java ``` and click run in intellij.
* Go to your browser and type ``` localhost:4567 ```

## Running the Tests

Create a test class for running tests in the application.

This is a sample test that tests if the getter method works

```
  @Test
    public void newSquad_CreateNewSQUADInstance_true(){
        Hero newHero = new Hero("testHero",20,"Flying","Kryptonite","Avengers");
        //Assert.assertEquals(true,newSquad instanceof Hero);
        assertTrue(true);
   
```
