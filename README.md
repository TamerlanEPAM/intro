#intro

Create Spring "Hello world" app.

Tech requirements:

Bean hierarchy:
Bean A (root)
    - Bean B
    - Bean C
         - Bean D
         - Bean E

Each child bean should implement common interface with printInfo() method which print class name and parent bean name that passed to this method.
Each parent bean should call child's printInfo() method.
Child beans should be injected via common interface using @Qualifier annotation.
Also you should inject collection of any user defined objects using @Autovired annotation and custom qualifier (use these two approaches in different beans).
You should configure the app using two different configuration styles: Java and XML.
