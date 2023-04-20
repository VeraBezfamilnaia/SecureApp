# SecureApp

## The purpose of the application

The purpose of the application is practice in method level security using spring boot security starter

## Usage example

https://user-images.githubusercontent.com/66965572/233360245-549872a0-41dd-4442-b56a-35268cf28462.mov

### Explanation
**case 1:** when invalid credentials are entered, the user doesn't have access to any actions  

**case 2:** when valid credentials are entered, user has access the corresponding methods (in this case, the user has access to the delete and read methods, but doesn't have access to the write method)

**case 3:** the user has access to the goodbye method if the username entered as a parameter matches the name of the logged user

