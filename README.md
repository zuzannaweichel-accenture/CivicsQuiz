# CivicsQuiz
Rest API containing Civics (History and Government) Questions for the Naturalization Test

## To start the application<br/>
* ### start up MySQL database and log in as civicsQuiz user
    * install and start mySQL database
        * ``` brew services start mysql ```
        * or ``` mysqld```
    * navigate to 'database' directory<br>
        * ``` ./create_civicsQuiz_db.sh``` 
* ### start project itself 
  * open new terminal (command n) 
   * navigate to project directory containing pom.xml
      * ```mvn test```
      * ```mvn spring-boot:run```
  * to open in inteliJ
    * ```idea pom.xml```  
 
* ### endpoints
```
GET
/api/inquiries - to get all
/api/inquiries/government -  American Government category
/api/inquiries/history - American History category
/api/inquiries/integrated - Integrated Civics category
/api/inquiry/{id} - inquiry by ID 

POST
/api/save - save inquiry

DELETE
/api/delete/{id} - delete by ID
```