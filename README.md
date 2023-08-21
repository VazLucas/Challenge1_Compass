<<<<<<< HEAD
# First Compass Challenge

#### From: *14/06/2023* to *21/06/2023*

### Instructions

- The challenge consists in five code challenges about Java, SQL and NoSQL
- Each code challenge must have its own production branch which will be merged to dev branch and then to main branch

# Code challenge 1

> - Main language: JAVA

- Tasks
  - [x] folder creation
  - [x] branch creation
  - [x] start code production
  - [x] question done
  
#### About the challenge

> Must output the student name that failed in the class respecting the quantity of problems solved and the name ordered alphabetically

> **First tiebraker** => number of problems solved
>
> **Second tiebraker** => last name alphabetically sorted

#### How to solve it

- Create one **Array List** to store the students name and another one to store how many problems were solved;
  - With an Array List will be easier <u> remove data</u>, <u> add data</u> and <u>comparing it</u>. The methods most used in the code.
  ~~~java
        ArrayList<Integer> problemSolved = new ArrayList<Integer>();
        ArrayList<String> studentsName = new ArrayList<String>();
  ~~~
- Instantiate a **Scanner Class** to receive the data input;
  ~~~java
     Scanner source = new Scanner(System.in);
  ~~~
  - With a loop that could be a **for** because we already know the number of students, each of them will be inserted in a different line, we will add:
    - Every single integer with the method <u>.nextInt()</u> (of the Scanner Class) to the problems Array List;
    - Every single string with the method <u>.next()</u> (of the Scanner Class)  to the students name Array List;
    ~~~java
    for (int i = 0; i < studentsQuantity; i++) {
              studentsName.add(source.next());
              problemSolved.add(source.nextInt());
          }
    ~~~
    - HERE COMES THE MAGIC, respecting the tiebreakers:
      - Using the **j** and **i** variables, the code will compare the values in the indexes that **j** and **i** points to
      ~~~java
      for (int j = problemSolved.size() - 1, i = 0; j > 0; j--)
      ~~~
      - The first if statement will remove from students name Array List and from the problems solved Array List the value in the **i** index if it is greater than the value in the **j** index 
      ~~~java
      if (problemSolved.get(i) > problemSolved.get(j)) {
                    problemSolved.remove(i);
                    studentsName.remove(i);
                }
      ~~~
      - In line 22, if the value in the **i** index is lower than the value in the **j** index, the values in the **j** index will be removed from both Array Lists.
      ~~~java
      else if (problemSolved.get(i) < problemSolved.get(j)) {
                    problemSolved.remove(j);
                    studentsName.remove(j);

                }
      ~~~
      - The last and most important, the piece of code below checks if both values (i and j) are equal to each other.
      ~~~java
       else if (Objects.equals(problemSolved.get(i), problemSolved.get(j)))
      ~~~
      - If so, it means that both students got the same number of problems solved, and we will go for the second tiebraker; 
      - The method str1.compareTo(str2) can return 3 distinct values, which can be:
        - An int value of 0 if the string is equal to the other string. 
          - A case which will not happen because there are no homonyms
        ~~~java
        else {
              System.out.println("Both students have the same name");
              break;
              }
        ~~~
        - An int value lower than 0 if the string is lexicographically less than the other string
        ~~~java
        else if (studentsName.get(i).compareTo(studentsName.get(j)) < 0) {
                      studentsName.remove(i);
                      problemSolved.remove(i);
                  }
        ~~~
        - An int value greater than 0 if the string is lexicographically greater than the other string (more characters)
        ~~~java
        else if (studentsName.get(i).compareTo(studentsName.get(j)) < 0) {
                      studentsName.remove(i);
                      problemSolved.remove(i);
                  }
        ~~~
      - At the end, the student with the least number os problems solved and with the last name alphabetically sorted will be printed out
        ~~~java
        System.out.println(studentsName.get(0));
        ~~~

# Code challenge 2

> - Main language: JAVA

- Tasks
  - [x] folder creation
  - [x] branch creation
  - [x] start code production
  - [x] question done
  
#### About the challenge

> Must output one of the next messages
> - **"Fun"** => if the amount happy faces is greater than the amount of sad faces
> - **"Neutral"** => if the amount of happy faces is equal than the amount of sad faces
> - **"Sad"** => if the amount of happy faces is lower than the amount of happy faces

#### How to solve it

- Create an **array** (_elements_) to store each element from the **string** (_line_) separated by whitespaces using the method **.split( )**;
- Instatiate a Scanner Class to read the input;
- With a **string** (_line_) store each .nextLine( )
- With two **int** variables
  ~~~java
        Scanner source = new Scanner(System.in);
        String line = source.nextLine();
        String[] elements = line.split(" ");
        int upsetCount = 0, funCount = 0;
  ~~~
- A **for each loop** is used to count how many `":-("` and `":-)"` are on the **array** (_elements_)
  ~~~ java
        for (String word : elements) {
            if (word.equals(":-(")){
                upsetCount++ ;
            } else if (word.equals(":-)")){
                funCount++;
            }
        }
  ~~~
- Finally, an **if statement** to check the numeric values of `upsetCount` and `funCount`;
  ~~~java
        if (upsetCount==funCount){
            System.out.println("Neutral");
        } else if (upsetCount > funCount) {
            System.out.println("Upset");
        } else {
            System.out.println("Fun");
        }
  ~~~
# Code challenge 3

> - Main language: JAVA

- Tasks
  - [x] folder creation
  - [x] branch creation
  - [x] start code production
  - [x] question done
  
#### About the challenge

> 

#### How to solve it

- ;

# Code challenge 4

> - Main language: SQL

- Tasks
  - [x] folder creation
  - [x] branch creation
  - [x] start code production
  - [x] question done

#### About the challenge

> Must write a scritp for PostgreSQL creating in this order:
> 1. **Create a database**;
> 2. **Create a table to store addresses with**
>    1. address_id
>    2. zip code
>    3. street name
>    4. complement for the address
>    5. neighborhood
>    6. city name
>    7. state name
>    8. country name;
> 3. **Create a table to store persons with**
>    1. person_id
>    2. name
>    3. age
>    4. phone
>    5. height
>    6. email
>    7. cpf
>    8. date of birth
>    9. address_id

> Note: 
The **address_id** in _Person Table_ should be a **foreign key** which refers to the **address_id** in the _Address Table_ 


#### How to solve it

- Using the SQL language create the first database;
- Then create the Address Table to first store the address to be referenced by the Person Table
- Finally, create the Person Table.

# Code challenge 5

> - Main language: NoSQL

- Tasks
    - [x] folder creation
    - [x] branch creation
    - [x] start code production
    - [x] question done

#### About the challenge

> Must create a script for MondoDB inserting a Person Document containing:
> - Object;
> - Name;
> - Age;
> - Phone;
> - Height;
> - Email;
> - CPF;
> - Date of birth;
> - Address
    >   - Zip code;
>   - Street name;
>   - Complement;
>   - Neighborhood;
>   - City;
>   - State;
>   - Country
#### How to solve it

- Download Mongosh, you can find more about it [here](https://www.mongodb.com/docs/mongodb-shell/);
- Start the executable file in .zip folder;
- Connect to your MongoDB server;
- And then follow the written code.
=======
>>>>>>> d940af37eaadd285c3c71c89232adcaa166fb868
